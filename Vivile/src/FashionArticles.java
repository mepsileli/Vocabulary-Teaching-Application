/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli, Dawood Muzammil
 */
import java.util.*;
public class FashionArticles extends Articles1 {
ArrayList<String> fashionArticles;
  String articles = "";
  int index;
  int indexOfUrl;
  int indexOfSpace;
  int findedInArticle;
  String url;
  
  
  public FashionArticles()
  {
    fashionArticles = new ArrayList<String>();
    fashionArticles.add("MyArticles/FashionArticles/MyArticle1_Fashion.txt");
    fashionArticles.add("MyArticles/FashionArticles/MyArticle2_Fashion.txt");
  }
  
  public ArrayList<String> getArrayList()
  {
    return fashionArticles;
  }
  
  public String getType()
  {
    return "Fashion";
  }
}
