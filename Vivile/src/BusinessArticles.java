import java.util.*;
/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli, Dawood Muzammil
 */
public class BusinessArticles extends Articles1{
  ArrayList<String> businessArticles;
  String articles = "";
  int index;
  int indexOfUrl;
  int indexOfSpace;
  int findedInArticle;
  String url;
  
  
  public BusinessArticles()
  {
    businessArticles = new ArrayList<String>();
    businessArticles.add("MyArticles/BusinessArticles/MyArticle1_Business.txt");
    businessArticles.add("MyArticles/BusinessArticles/MyArticle2_Business.txt");
  }
  
  public ArrayList<String> getArrayList()
  {
    return businessArticles;
  }
  
  public String getType()
  {
    return "Business";
  }
}
