package other;
import java.util.regex.*;  

public class Task_2 {
	public static String capitalizeFirstLetters(String s) {
		/*
		Please implement this method to
		capitalize all first letters of the words in the given String.
		All other symbols shall remain intact. If a word starts not with a letter, it shall remain intact too.
		Assume that the parameter String can only contain spaces and alphanumeric characters.

		NOTE: please keep in mind that the words can be divided by single or multiple spaces.
		The spaces also can be found at the beginning or the end of the parameter string,
		and you need to preserve them.

		Please add a main method which evaluates and displays one or more test cases.
		 */
		StringBuilder output = new StringBuilder(s.length());
		boolean firstLetter =true;
		for(int i = 0; i < s.length(); i++) {
			char currentCharacter = s.charAt(i);
			String temp = ""+currentCharacter; 

			if(firstLetter && !(temp.matches("[0-9]")|| temp.equals(" "))) {
				firstLetter = false;
				temp = temp.toUpperCase();
			}
			output.append(temp);
		}
		return String.valueOf(output);
	}
	public static void main(String...s) {
		System.out.println(capitalizeFirstLetters("  3 hardeep"));
	}
}
