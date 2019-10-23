/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli, Dawood Muzammil
 */
import java.util.*;
public class SportArticles extends Articles1 {

  ArrayList<String> sportArticles;
  String articles = "";
  int index;
  int indexOfUrl;
  int indexOfSpace;
  int findedInArticle;
  String url;
  
  
  public SportArticles()
  {
    sportArticles = new ArrayList<String>();
    sportArticles.add("MyArticles/SportArticles/MyArticle1_Sport.txt");
    sportArticles.add("MyArticles/SportArticles/MyArticle2_Sport.txt");
  }
  
  public ArrayList<String> getArrayList()
  {
    return sportArticles;
  }
  
  public String getType()
  {
    return "Sport";
  }
  
  public String getArticles()
  {
    for (int i = 0; i < sportArticles.size(); i++)
    {
      articles = articles + "Article retrieved from = " + sportArticles.get(i) + " " + "getContent( sportArticles.get(0) )";
    }
    
    return articles;
  }
  
  public int findInArticles( String s )
  {
    index = getArticles().indexOf(s);
    
    indexOfUrl = getArticles().lastIndexOf("http.//" , index);
    
    indexOfSpace = getArticles().indexOf(" " , indexOfUrl);
    
    url = getArticles().substring(indexOfUrl , indexOfSpace);
    
    for ( int i = 0; i < sportArticles.size(); i++)
    {
      if( sportArticles.get(i).equals( url ) )
      {
        findedInArticle = i;
        i = sportArticles.size();
      }
    }
    return findedInArticle;
  }
  
  public String findedArticle()
  {
    return "getContent( sportArticles.get(findInArticles) )";
  }
}
