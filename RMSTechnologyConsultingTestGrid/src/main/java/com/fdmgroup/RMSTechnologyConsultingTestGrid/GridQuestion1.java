package com.fdmgroup.RMSTechnologyConsultingTestGrid;

public class GridQuestion1 {

	// Method for Question 1
	public int getCombinationsOfThreeAdjacentNumbersIn10x10Grid(int[][] grid) {

		int row = grid.length;
		int column = grid[0].length;

		//This method only works on a 10x10 grid with 3 adjacent numbers in the same
		//direction (up, down, left, right or diagonally)
		if (row == 10 && column == 10) {

			@SuppressWarnings("unused")
			int Product;
			int count = 0;

			// Check horizontally, therefore the first element of the last group on every row is at 8th
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 8; j++) {
					Product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2];
					count++;
				}
			}

			// Check vertically, therefore the first element of the last group on every column is at 8th
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 10; j++) {
					Product = grid[i][j] * grid[i + 1][j] * grid[i + 2][j];
					count++;
				}
			}

			// Check diagonally right , from top to bottom, 
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					Product = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2];
					count++;
				}
			}

			// Check diagonally left
			for (int i = 0; i < 8; i++) {
				for (int j = 2; j < 10; j++) {
					Product = grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2];
					count++;
				}
			}

			return count;
		} else {
			System.out.println("row and column must be 10");
			return 0;
		}
	}
}
