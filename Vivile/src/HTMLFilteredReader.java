/*
 * This class reads HTML sites and 
 * gets their contents with or without HTML codes with extending MySimpleURLReader
 * @author Berat Mert Aktaþ
 * @version 6.03.2017
 */

public class HTMLFilteredReader extends MySimpleURLReader
{
  private String link;
  public HTMLFilteredReader(String link)
  {
    super(link);
    this.link = link;
  }
  @Override
  /*This methods gets the HTML code and make it a html tags free 
   * poem as we wanted to see
   * @return contents of the page
   */
  public String getPageContents()
 {
    String unfiltered = super.getPageContents();
    String temp = "";
    String charHolder;
    int i = 0;
    while(unfiltered.length() >  i)
    {
      
      if(unfiltered.charAt(i) == '<')
      {
        while( i < unfiltered.length() && unfiltered.charAt(i) != '>' )
        {
          i++;
        }
        i++;
        
      }
      while( i < unfiltered.length() && unfiltered.charAt(i) != '<' )
      {
        charHolder = "" + unfiltered.charAt(i);
        temp = temp.concat( charHolder);
        i++;
      }
    }
    return temp;
  }
  
 // This is an alternative and a more efficient method for the wanted method
//  public String getPageContents()
//  {
//
//    String temp = super.getPageContents();
//    StringBuilder sb = new StringBuilder(temp);
//    int i = 0;
//    while(sb.length() > i)
//    {
//      if(sb.charAt(i) == '<')
//      {
//       while(sb.charAt(i ) != '>')
//       {
//         sb.deleteCharAt(i);
//       }
//       sb.deleteCharAt(i);
//      }
//            if(sb.charAt(i) == '&')
//      {
//        for(int t = 0; 6>t; t++)
//        {
//          sb.deleteCharAt(i);
//        }
//      }
//       if(sb.charAt(i) != '<')
//       {
//         i++;
//       }
//    }
//    return sb.toString();
//  }
  /*This method basically gets the page contents
   *Without cleaned or anything
   *@return the code with the content
   */
  public String getUnfilteredPageContents()
  {
    return super.getPageContents();
    
  }
  
}