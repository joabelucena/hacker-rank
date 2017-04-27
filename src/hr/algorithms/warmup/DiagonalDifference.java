package hr.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int matrix[][] = new int[n][n];
			
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < n; j++) 
					matrix[i][j] = sc.nextInt();
			
			int diff = 0;
			
			for(int i = 0, j = n-1; i < n ; i++, j--){
				diff += matrix[i][i] - matrix[j][i];
			}
			
			System.out.println(Math.abs(diff));
			

		}

	}

}
