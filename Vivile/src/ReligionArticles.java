/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli, Dawood Muzammil
 */
import java.util.*;
/**
 * Auto Generated Java Class.
 */
public class ReligionArticles extends Articles1 {
  
ArrayList<String> religionArticles;
  String articles = "";
  int index;
  int indexOfUrl;
  int indexOfSpace;
  int findedInArticle;
  String url;
  
  
  public ReligionArticles()
  {
    religionArticles = new ArrayList<String>();
    religionArticles.add("MyArticles/ReligionArticles/MyArticle1_Religion.txt");
    religionArticles.add("MyArticles/ReligionArticles/MyArticle2_Religion.txt");
  }
  
  public ArrayList<String> getArrayList()
  {
    return religionArticles;
  }
  
  public String getType()
  {
    return "Religion";
  }
}
