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
	private static boolean isOneOneStringIsPermutationOfOtherString(String first, String second) {
		// one approach is will sort both strings then compare..

		if (first.length() != second.length())
			return false;
		char[] secondArray = second.toCharArray();
		for(int i =0 ;i<first.length();i++) {
			for(int j=i;j<secondArray.length;j++) {
				if(first.charAt(i) == secondArray[j]) {
					char temp = secondArray[j];
					secondArray[j] = secondArray[i];
					secondArray[i] = temp;
					break;
				}
				if(j==secondArray.length-1)
					return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isOneOneStringIsPermutationOfOtherString("abc", "cab");
		System.out.println("Result = " + result);
	}

}
