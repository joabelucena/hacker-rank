package hr.algorithms.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			List<Integer> height = new ArrayList<>(n);
			for (int i = 0; i < n; i++) {
				height.add(in.nextInt());
			}

			Collections.sort(height);

			System.out.println(Collections.frequency(height, height.get(n - 1)));
		}

	}

}
