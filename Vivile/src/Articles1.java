/**
 * Auto Generated Java Class.
 * @author Berat Mert Aktaş, Talha Zeeshan
 */
import java.util.*;
import java.io.*;
/**
 * Auto Generated Java Class.
 */
public abstract class Articles1 {
  
  //Return the ArrayList of the article urls
  public abstract ArrayList<String> getArrayList();
  
  //Return the type of article
  public abstract String getType();
  
  //Return all articles about a genres. For example if this method is called for a sportArticles, this method returns all sportArticles.
  public String getArticles( ArrayList<String> a) throws FileNotFoundException, IOException
  {
    String articlesContent = "";
    
    for (int i = 0; i < getArrayList().size(); i++)
    {
      articlesContent = articlesContent + "Article retrieved from = " + a.get(i) + " ";
      articlesContent = articlesContent + getContent( a.get(i) );
    }
    
    return articlesContent;
  }
  
  /*Return the index number ( in ArrayList) of the article which the searching word is found in. getArticle method adds the urls of the article top of the
   each article. When the searching word is found in an article, this method defines the url of this article and find the index of this url in ArrayList.*/
  public int findInArticles( String searchingWord , ArrayList<String> a) throws FileNotFoundException, IOException
  {
    int findedInArticle = -1 ;
    int indexOfFileName;
    int indexOfSpace;
    String fileName;
    
    int indexOfWord = getArticles(a).indexOf( searchingWord );
    
    if( indexOfWord != -1)
    {     
    indexOfFileName = getArticles(a).lastIndexOf("MyArticles" , indexOfWord);
   
    indexOfSpace = getArticles(a).indexOf(" " , indexOfFileName);
    
    fileName = getArticles(a).substring(indexOfFileName , indexOfSpace);
    }
    
    else 
      return -1;

    
    for ( int i = 0; i < a.size(); i++)
    {
      if( a.get(i).equals( fileName ) )
      {
        findedInArticle = i;
        i = a.size();
      }
    }
    return findedInArticle;
  }
  
  //Return true, if the searchingWord is found in one of the articles.
  public boolean isFound(String searchingWord , ArrayList<String> a ) throws FileNotFoundException, IOException
  {
    return findInArticles(searchingWord , a) != -1;
  }
  
  
  //Return the article which searching word is found in as a string.
  public String findedArticle(String searchingWord , ArrayList<String> a) throws FileNotFoundException, IOException
  {
    if(findInArticles ( searchingWord, a ) == -1 )
      return "Sorry ! This word cannot be found in the articles.";
    
    return getContent( a.get( findInArticles( searchingWord, a ) ) );
  }
  
  public String getContent(String filePlace) throws FileNotFoundException, IOException
  {
    String str;
    String all = "";
    FileReader fr = new FileReader(filePlace);
    BufferedReader br = new BufferedReader(fr);
    
    try{
      while((str = br.readLine()) != null){
        all = all + str;
      }
    }
    catch(FileNotFoundException e){
      System.err.format("Field could not be found ");
    }
    return all;
  }
}
