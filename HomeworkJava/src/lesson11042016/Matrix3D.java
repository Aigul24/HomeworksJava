package lesson11042016;

public class Matrix3D {

	public static void main(String[] args) {
		int[][][] matrix = { { { 2, 14, 35, 0 }, { 67, 0, 4, 16 }, { 76, 7, 1, 13 } },

				{ { 43, 32, 5, 21 }, { 3, 10, 53, 16 }, { 11, 5, 27, 46 } },
				{ { 21, 8, 34, 0 }, { 3, 65, 81, 0 }, { 93, 0, 27, 46 }

				}, };

		System.out.println("Слои, которые содержат 0: ");
		OUTER: for (int layer = 0; layer < matrix.length; layer++) {
			for (int row = 0; row < matrix[layer].length; row++) {
				for (int coloumn = 0; coloumn < matrix[layer][row].length; coloumn++) {
					if (matrix[layer][row][coloumn] == 0) {
						System.out.println(layer);
						continue OUTER;
					}
				}
			}

		}

	}
}
