package com.fdmgroup.RMSTechnologyConsultingTestGrid;

public class GridQuestion2 {

	// Method for Question 2
	public  long findProduct(int[][] grid, int length) {

		int row = grid.length;
		int column = grid[0].length;

		//exclude out of bound situation
		if (row >= length || column >= length || length > 1) {

			long product = 0;
			long largest = 0;
			//Added index k for adjustable value of length
			// Check horizontally
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column - (length - 1); j++) {
					product = 1;
					for (int k = 0; k < length; k++) {
						product *= grid[i][j + k];
						if (product > largest) {
							largest = product;
						}
					}
				}
			}

			// Check vertically

			for (int i = 0; i < row - (length - 1); i++) {
				for (int j = 0; j < column; j++) {
					product = 1;
					for (int k = 0; k < length; k++) {
						product *= grid[i + k][j];
						if (product > largest) {
							largest = product;
						}
					}
				}
			}
			// Check diagonally right
			for (int i = 0; i < row - (length - 1); i++) {
				for (int j = 0; j < column - length - 1; j++) {
					product = 1;
					for (int k = 0; k < length; k++) {
						product *= grid[i + k][j + k];
						if (product > largest) {
							largest = product;
						}
					}
				}
			}

			// Check diagonally left

			for (int i = 0; i < row - (length - 1); i++) {
				for (int j = length - 1; j < column; j++) {
					product = 1;
					for (int k = 0; k < length; k++) {
						product *= grid[i + k][j - k];
						if (product > largest) {
							largest = product;
						}
					}
				}
			}

			return largest;
		} else {
			System.out.println("row or column cannot be less than length");
			return 0;
			
		}
	}
}
