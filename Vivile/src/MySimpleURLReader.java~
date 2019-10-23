import cs1.SimpleURLReader;
/*
 * This class reads txt sites and 
 * gets their contents with extending SimpleURLReader class 
 * @author Berat Mert Aktaþ
 * @version 6.03.2017
 */
public class MySimpleURLReader extends SimpleURLReader
{
 //parameters
  private String link;
  
  //constructors
  public MySimpleURLReader(String link)
  {
    super(link);
    this.link = link;
  }
  
  //methods
  
  /*This methods gives the URL of the link
   * @return the link of the object
   * 
   */
  public String getURL()
  {
    return link;
    
  }
  /*This methods gives the name of the file 
   * @return name of the file ex: housman.txt
   * 
   */
  public String getName()
  {
    String name = "";
    for(int i = link.length() - 1; i > 0 ;i--)
    {
      while ( link.charAt(i) != '/')
      {
        name = link.charAt(i) + name;
        i--;
      }
      return name;
    }
    return name;
  }
  @Override
  /*This methods gives the contents of the page
   * and checks
   * @return contents of the page 
   */
  public String getPageContents()
  {
    if(super.getPageContents().substring(0,3).equals("null"))
      return super.getPageContents().substring(4);
    else
      return super.getPageContents();
  }
  
}