package hr.algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			long d = in.nextLong();
			long e = in.nextLong();

			long[] ar = new long[5];

			ar[0] = b + c + d + e;
			ar[1] = a + c + d + e;
			ar[2] = a + b + d + e;
			ar[3] = a + b + c + e;
			ar[4] = a + b + c + d;

			Arrays.sort(ar);

			System.out.print(ar[0] + " ");
			System.out.println(ar[ar.length - 1]);
		}

	}

}
