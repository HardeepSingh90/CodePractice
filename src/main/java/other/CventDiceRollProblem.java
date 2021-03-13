
package other;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class CventDiceRollProblem {
	public int[] solution(int[] A, int F, int M) {
		// write your code in Java SE 8

		//total_dice_rolls =a.length+f
		//((sum of array A+missing numbers)/total_dice_rolls)=M

		//return 0 if array not exists
		if(F < 0 || M < 1 || M > 6) return new int[]{0};

		int[] missingDiceRolls = new int[F];
		int totalDiceRolls = A.length + F;
		int sumOfKnownRolls = 0;

		for (int a : A) {
			sumOfKnownRolls = sumOfKnownRolls+a;
		}
		int sumOfAllRolls = M*totalDiceRolls;
		int sumOfUnknownRolls = sumOfAllRolls - sumOfKnownRolls;

		if(F > sumOfUnknownRolls || sumOfUnknownRolls / F > 6) return new int[] {0};

		for (int i = 0; i < missingDiceRolls.length; i++) {
			missingDiceRolls[i] = sumOfUnknownRolls/F--;
			sumOfUnknownRolls -= missingDiceRolls[i];
		}
		return missingDiceRolls;

	}

	public static void main(String...s) {
		CventDiceRollProblem ss = new CventDiceRollProblem();
		int[] A= {3,2,4,3};
		//System.out.println(""+));
		for(int a:ss.solution(A, 2, 4)) {
			System.out.println(a);
		}
	}
}