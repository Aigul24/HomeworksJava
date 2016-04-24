package lesson160411;

public class Matrix3D {

	public static void main(String[] args) {
		int[][][] matrix = { { { 2, 14, 35, 0 }, { 67, 0, 4, 16 }, { 76, 7, 1, 13 } },

				{ { 43, 32, 5, 21 }, { 3, 10, 53, 16 }, { 11, 5, 27, 46 } },
				{ { 21, 8, 34, 0 }, { 3, 65, 81, 0 }, { 93, 0, 27, 46 }

				}, };

		OUTER: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int k = 0; k < matrix[i][j].length; k++) {
					if (matrix[i][j][k] == 0) {
						System.out.println(i);
						continue OUTER;
					}

				}
			}

		}

	}
}
