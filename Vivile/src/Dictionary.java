/**
 *This class shows definition
 * @author Mert Aktaş, Mehmet Mert Epsileli, Yusuf Samsum
 * @version 20.04.2017
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
  
public class Dictionary
{
  public static void main(String args[])
  {
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
   HTMLFilteredReader test3 = new HTMLFilteredReader("http://wordnetweb.princeton.edu/perl/webwn?s=" + word);
   String holder = test3.getPageContents();
   if(holder.indexOf("sentence\"") == -1)
     holder = "The word is not found!";
   else{
       holder = holder.substring(holder.indexOf("sentence\"")+10);
     
   }
   try{    
           FileWriter fw=new FileWriter("C:/Users/User/Downloads/proje/definition.txt");    
           fw.write(holder);    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          
    }    
  
  }
