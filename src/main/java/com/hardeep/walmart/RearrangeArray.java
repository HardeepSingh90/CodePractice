/**
 * 
 */
package com.hardeep.walmart;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hardeep Singh
 *
 */
public class RearrangeArray {

	private static void reArrange(int[] arr) {
		List<Object> intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
	
		int[] output = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(intList.contains(i)) {	
				output[i] = i;
			}
			else {
				output[i] = -1;
			}
		}
		for(int val : output)
		System.out.print(val+",");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * input arr={1,-1,4,3,-1,6,-1,8}
		 * output ={1,-1,3,4,-1,6,-1,8}
		 * **/
       int[] arr={1,-1,4,3,-1,6,-1,8};
       reArrange(arr);
	}

}
