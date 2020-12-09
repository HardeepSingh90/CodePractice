/**
 * 
 */
package arrays_string;

/**
 * @author hardeesi
 * Question:-IS UNIQUE:implement an algorithm to determine if a string has all unique characters.
 */
public class FindUniqueCharacterInString {

	/**
	 * @param input
	 * @return
	 */
	private static boolean isDuplicateCharacterPresent(String input) {
		boolean flag = false;
		for (int character = 0; character < input.length() - 1; character++) {
			for (int loop = character + 1; loop < input.length(); loop++) {
				if (input.charAt(character) == input.charAt(loop)) {
					flag = true;
					break;
				}
				if (flag)
					break;
			}
		}
		return flag;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isDuplicateCharacterPresent("depak");
		System.out.println("all unique characters ? = " + !result);
	}

}
