package hr.algorithms.warmup;

import java.util.Scanner;

/**
 * Given an array of integers, calculate which fraction of its elements are
 * positive, which fraction of its elements are negative, and which fraction of
 * its elements are zeroes, respectively. Print the decimal value of each
 * fraction on a new line.
 * 
 * 
 * @author root
 *
 */
public class PlusMinus {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();

			float p, n, z;
			p = n = z = 0;

			for (int i = 0; i < length; i++) {
				int num = sc.nextInt();
				if (num > 0) p++;
				if (num < 0) n++;
				if (num == 0) z++;
			}

			System.out.println(p / length);
			System.out.println(n / length);
			System.out.println(z / length);
		}

	}

}
