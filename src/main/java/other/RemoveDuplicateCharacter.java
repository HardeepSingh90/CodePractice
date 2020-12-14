/**
 * 
 */
package other;

import java.util.Arrays;

/**
 * @author hardeesi
 *
 */
public class RemoveDuplicateCharacter {

	static String removeDuplicate(char str[], int n) {
		// Used as index in the modified string
		int index = 0;

		// Traverse through all characters
		for (int i = 0; i < n; i++) {

			// Check if str[i] is present before it
			int j;
			for (j = 0; j < i; j++) {
				System.out.println("----"+str[i]+" i="+i+" ----"+str[j]+" j="+j);
				if (str[i] == str[j]) {System.out.println("entered");
					break;
				}
			}

			// If not present, then add it to
			// result.
			if (j == i) {System.out.println("done");
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}

	// Driver code
	public static void main(String[] args) {
		char str[] = "geeksforgeeks".toCharArray();
		int n = str.length;
		System.out.println(removeDuplicate(str, n));
	}

}
