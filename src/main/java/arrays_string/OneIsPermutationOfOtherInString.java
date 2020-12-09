/**
 * 
 */
package arrays_string;

/**
 * @author hardeesi Question:- Given two Strings,write a method to decide if one
 *         is a permutation of other
 *
 */
public class OneIsPermutationOfOtherInString {

	/**
	 * @param first
	 * @param second
	 * @return
	 */
	private static boolean isOneOneStringIsPermutationOfOtherString(String first, StringBuffer second) {
		// one approach is will sort both strings then compare..

		for (int i = 0; i < first.length(); i++) {
             boolean flag = true;
			for (int j = 0; j < second.length(); j++) {
				if (first.charAt(i) == second.charAt(j)) {
					
					flag = false;
					second.deleteCharAt(j);
			System.out.println(i+""+j);		
					if (i == first.length() - 1)
						return true;

					break;
				}
			}
			if ((first.length() != second.length()) || flag) {System.out.println(first.length()+"here"+second.length());
				return false;}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isOneOneStringIsPermutationOfOtherString("abc", new StringBuffer("cbac"));
		//its not working
		System.out.println("Result = " + result);
	}

}
