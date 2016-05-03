package lesson28042016;

import java.util.Arrays;

public class MatrixMax {

	public static void main(String[] args) {

		int[][] matrix = { { 2, 5, 13, 1 }, { 12, 5, 42, 3 }, { 21, 32, 4, 5 }, { 8, 1 },

		};

		int[] v = MatrixMaxVector(matrix);
		System.out.println(Arrays.toString(v));

	}

	static int[] MatrixMaxVector(int[][] a) {
		int[] vector = new int[a.length];
		for (int row = 0; row < a.length; row++) {
			int max = a[row][0];
			for (int coloumn = 1; coloumn < a[row].length; coloumn++) {
				if (a[row][coloumn] > max) {
					max = a[row][coloumn];
				}
			}
			vector[row] = max;
		}

		return vector;

	}

}
