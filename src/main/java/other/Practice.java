package other;


import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Practice {


    // Complete the noOfWaysToDrawTheGame function below.
    static int noOfWaysToDrawTheGame(int totalScore) {
        int count = 0;
        if(totalScore%2!=0)
           return 0;
     int c=0;
     for(int bookPage = 2; bookPage<=6 ;){
         int sum = bookPage;
         for(int i = 2 ;i<=6;){
        	 if(totalScore == sum && (totalScore ==bookPage && totalScore ==i) && c!=0) {
        		 count++;c++;}
        	 if(totalScore ==bookPage)
                 break;
                if(totalScore == sum || totalScore ==i){
                  count++;
                  sum = bookPage;
                  i=i+2;
                  
                }
                else{
                 sum = i+sum;
                 if(sum>totalScore)
                 break;
                }
                
            }
         bookPage = bookPage +2;  
        }
      return count;
    }
    public static void main(String arg[])
    {
       
        System.out.println(noOfWaysToDrawTheGame(10));

    }
}