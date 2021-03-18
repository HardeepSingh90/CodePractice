package other;

import java.util.Arrays;

public class Task_1 {
	
    public static int getClosestToZero(int[] a)  {
        /*
        Please implement this method to
	return the number in the array that is closest to zero.
	If there are two equally close to zero elements like 2 and -2,
	consider the positive element to be "closer" to zero.
	      
	Please add a main method which evaluates and displays one or more test cases.
	*/
    int[] b = a;
    Arrays.sort(b);
    int closestNum = b[0];
	int lastNegativeNum=closestNum;
    for(int num:b) {
    	if(num<0) {
    		lastNegativeNum = num;
    	}
    	else {
    		closestNum =num;
    		if((Math.abs(lastNegativeNum))<num) closestNum = lastNegativeNum;
    		break;
    	}
    }
   return closestNum;
    }
    public static void main(String...s) {
    	int arr[] = { 9, 3, -2, 1, 6, 6, 8, 9 }; 
    	System.out.println(""+getClosestToZero(arr));
    }
}