package com.fdmgroup.RMSTechnologyConsultingTestGrid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGridQuestion2 {

	int[][] grid;
	
	long greatestProduct;
	
	GridQuestion2 gridQuestion2;
	
	@BeforeEach
	void setup() throws Exception {

		// Arrange
		gridQuestion2 = new GridQuestion2();
	}
	
	@Test
	public void test_FindProductIn10x10GridWithLength3_Return667755_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			{ 8, 2, 22, 97, 38, 15, 0, 40, 0, 75 }, 
									 { 49, 49, 99, 40, 17, 81, 18, 57, 60, 87 }, 
									 { 81, 49, 31, 73, 55, 79, 14, 29, 93, 71 },
									 { 52, 70, 95, 23, 4, 60, 11, 42, 69, 24 },
									 { 22, 31, 16, 71, 51, 67, 63, 89, 41, 92 },
									 { 24, 47, 32, 60, 99, 3, 45, 2, 44, 75 },
									 { 32, 98, 81, 28, 64, 23, 67, 10, 26, 38 },
									 { 67, 26, 20, 68, 2, 62, 12, 20, 95, 63 },
									 { 24, 55, 58, 5, 66, 73, 99, 26, 97, 17 },
									 { 21, 36, 23, 9, 75, 0, 76, 44, 20, 45 } 
									 };
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 3);

		assertEquals(667755, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn20x20GridWithLength4_Return70600674_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 8, 02, 22, 97, 38, 15, 00, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91, 8 },
									{ 49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 00 },
									{ 81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65 },
									{ 52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91 },
									{ 22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80 },
									{ 24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50 },
									{ 32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70 },
									{ 67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21 },
									{ 24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72 },
									{ 21, 36, 23, 9, 75, 00, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95 },
									{ 78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 04, 62, 16, 14, 9, 53, 56, 92 },
									{ 16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57 },
									{ 86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58 },
									{ 19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40 },
									{ 04, 52, 8, 83, 97, 35, 99, 16, 07, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66 },
									{ 88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69 },
									{ 04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36 },
									{ 20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16 },
									{ 20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54 },
									{ 01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48 } 
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 4);

		assertEquals(70600674, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn3x3GridWithLength3_Return504_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 1, 2, 3 }, 
									 { 4, 5, 6 }, 
									 { 7, 8, 9},
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 3);

		assertEquals(504, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn2x3GridWithLength3_Return120_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 1, 2, 3 }, 
									 { 4, 5, 6 }, 
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 3);

		assertEquals(120, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn1x3GridWithLength3_Return6_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 1, 2, 3 }, 
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 3);

		assertEquals(6, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn10x10GridWithLength2_Return9603_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 8, 2, 22, 97, 38, 15, 0, 40, 0, 75 }, 
									 { 49, 49, 99, 40, 17, 81, 18, 57, 60, 87 }, 
									 { 81, 49, 31, 73, 55, 79, 14, 29, 93, 71 },
									 { 52, 70, 95, 23, 4, 60, 11, 42, 69, 24 },
									 { 22, 31, 16, 71, 51, 67, 63, 89, 41, 92 },
									 { 24, 47, 32, 60, 99, 3, 45, 2, 44, 75 },
									 { 32, 98, 81, 28, 64, 23, 67, 10, 26, 38 },
									 { 67, 26, 20, 68, 2, 62, 12, 20, 95, 63 },
									 { 24, 55, 58, 5, 66, 73, 99, 26, 97, 17 },
									 { 21, 36, 23, 9, 75, 0, 76, 44, 20, 45 }  
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 2);

		assertEquals(9603, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn20x20GridWithLength20_Return0_whenAllZeroGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 20);

		assertEquals(0, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn20x20GridWithLength10_Return3628800_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
										{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 10);

		assertEquals(3628800, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn5x3GridWithLength3_ReturnMinus19602_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 1, 2, 3 }, 
									 { 0, 0, 5 }, 
									 { 1, 2, 2},
									 { 7, 18, 99},
									 { 0, 8, 99}
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 3);

		assertEquals(19602, greatestProduct);
	}
	
	@Test
	public void test_FindProductIn5x6GridWithLength2_Return250000_whenExampleGridWithNegativePassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 1, 2, 3 ,-500,6,89}, 
									 { 0, 0, -500,68,12,58}, 
									 { 1, 2, 2,-8,93,7},
									 { 7, 18, 99,-167,0,2},
									 { 0, 8, 99,156,5,4}
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 2);

		assertEquals(250000, greatestProduct);
	}
	
	//OutOfBoundSituation
	@Test
	public void test_FindProductIn5x6GridWithLength10_Return0_whenExampleGridWithNegativePassedIn() {
		// @formatter:off
		int[][] grid = { 			 { 1, 2, 3 ,-500,6,89}, 
									 { 0, 0, -500,68,12,58}, 
									 { 1, 2, 2,-8,93,7},
									 { 7, 18, 99,-167,0,2},
									 { 0, 8, 99,156,5,4}
									};
		// @formatter:on

		long greatestProduct = gridQuestion2.findProduct(grid, 10);

		assertEquals(0, greatestProduct);
	}
	
}
