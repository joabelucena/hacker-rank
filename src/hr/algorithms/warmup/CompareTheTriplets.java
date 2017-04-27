package hr.algorithms.warmup;

import java.util.Scanner;

public class CompareTheTriplets {
	static String solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int a, b;
		a = b = 0;

		if (a0 > b0) a++;
		else if (b0 > a0) b++;
		if (a1 > b1) a++;
		else if (b1 > a1) b++;
		if (a2 > b2) a++;
		else if (b2 > a2) b++;

		return String.valueOf(a).concat(" ").concat(String.valueOf(b));

	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int a0 = in.nextInt();
			int a1 = in.nextInt();
			int a2 = in.nextInt();
			int b0 = in.nextInt();
			int b1 = in.nextInt();
			int b2 = in.nextInt();
			String result = solve(a0, a1, a2, b0, b1, b2);
			System.out.println(result);

		}
	}
}
