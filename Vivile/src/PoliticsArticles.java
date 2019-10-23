/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli, Dawood Muzammil
 */
import java.util.*;
/**
 * Auto Generated Java Class.
 */
public class PoliticsArticles extends Articles1 {
  ArrayList<String> politicsArticles;
  String articles = "";
  int index;
  int indexOfUrl;
  int indexOfSpace;
  int findedInArticle;
  String url;
  
  
  public PoliticsArticles()
  {
    politicsArticles = new ArrayList<String>();
    politicsArticles.add("MyArticles/PoliticsArticles/MyArticle1_Politics.txt");
    politicsArticles.add("MyArticles/PoliticsArticles/MyArticle2_Politics.txt");
  }
  
  public ArrayList<String> getArrayList()
  {
    return politicsArticles;
  }
  
  public String getType()
  {
    return "Politics";
  }
}
