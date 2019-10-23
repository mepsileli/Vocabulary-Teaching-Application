import java.io.*;
import java.util.Scanner;
/**
 * Auto Generated Java Class.
 * @author Mehmet Mert Epsileli
 */
public class Test {
  
  
  public static void main(String[] args) throws FileNotFoundException, IOException{ 
    SportArticles sport = new SportArticles();
    
    //System.out.println(sport.getArticles( sport.getArrayList() ));
    String word = "";
        File file = new File("C:/Users/User/Downloads/proje/word.txt");
        try{
            Scanner scan1 = new Scanner(file);
            if(scan1.hasNextLine())
            {
                word = scan1.nextLine();
            }
                
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            
        }   
    String holder = sport.findedArticle( word , sport.getArrayList());
        try{    
           FileWriter fw=new FileWriter("C:/Users/mert/Desktop/proje/article.txt");    
           fw.write(holder);    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
  }
}
