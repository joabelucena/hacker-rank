package hr.algorithms.warmup;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			int k = in.nextInt();

			int sum = 0;

			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			// Write Your Code Here

			for (int i = 0; i < a.length; i++)

				for (int j = i; j < a.length; j++)

					if (((a[i] + a[j]) % k) == 0 && i < j)

						sum++;

			System.out.println(sum);
		}

	}

}
