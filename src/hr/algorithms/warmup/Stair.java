package hr.algorithms.warmup;
import java.util.Scanner;

public class Stair {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();

			stairs(n);
		}
	}

	static void stairs(int n) {
		for (int i = 1; i <= n; i++) {

			System.out.println(String.format("%" + n + "s", new String(new char[i]).replace("\0", "#")));
		}
	}

}
