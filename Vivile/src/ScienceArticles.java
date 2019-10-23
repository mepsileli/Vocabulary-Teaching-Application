/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli, Dawood Muzammil
 */
import java.util.*;
public class ScienceArticles extends Articles1 {
  ArrayList<String> scienceArticles;
  String articles = "";
  int index;
  int indexOfUrl;
  int indexOfSpace;
  int findedInArticle;
  String url;
  
  
  public ScienceArticles()
  {
    scienceArticles = new ArrayList<String>();
    scienceArticles.add("MyArticles/ScienceArticles/MyArticle1_Science.txt");
    scienceArticles.add("MyArticles/ScienceArticles/MyArticle2_Science.txt");
  }
  
  public ArrayList<String> getArrayList()
  {
    return scienceArticles;
  }
  
  public String getType()
  {
    return "Science";
  }
}
