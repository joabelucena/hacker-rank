package hr.algorithms.warmup;

import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int length = sc.nextInt();
			long sum = 0;

			for (int i = 0; i < length; i++) {
				sum += sc.nextLong();
			}
			
			System.out.println(sum); 
		}

	}

}
