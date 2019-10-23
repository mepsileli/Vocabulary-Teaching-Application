/**
 * Auto Generated Java Class.
 * @author Fırat Yıldız
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.lang.*;

public class SecondGiver{
   
   String str;
   String all = "";
   String seek;
   String time;
   int a = 0;
   int timeCo;
   int startTime;
   int stopTime;
   
   public SecondGiver(String file, String seek) {
      
      String fileName = file + ".txt";
      try{
        FileReader fr = new FileReader( fileName );
        BufferedReader br = new BufferedReader( fr );

        this.seek = seek;
      
         while((str = br.readLine()) != null){
            
            if(str.indexOf("black") >= 0){
               all = all + str;
            }
            all = all + str;
         }
      }
      catch(IOException e){
         System.err.format("field could not be found ");
      }
      
      timeCo = signFinder(all.indexOf(seek),all);
      time = all.substring(timeCo - 13, timeCo - 5);
      startTime = convertSecond(time);
      stopTime = startTime + 30;
   }
   
   public static int signFinder(int index, String all){
      int sign;
      for(int i = index; i > 0; i -- ){
         if(all.charAt(i) == '>' ){
            sign = i - 2;
            return sign;
         }
      }
      return -1;
   }
   public static int convertSecond(String minute){
      String minS = minute.charAt(3)+ "" + minute.charAt(4) ; 
      String secS = minute.charAt(6)+ "" + minute.charAt(7);
      
      int hour = Integer.parseInt(minute.charAt(1) + "");
      int min  = Integer.parseInt(minS);
      int sec  = Integer.parseInt(secS);
      
      return (hour * 3600) + (min * 60) + sec;
   }
   
   public int getStartTime(){
      return startTime - 2;
   }
   
   public int getStopTime(){
      return stopTime - 15;
   }
}