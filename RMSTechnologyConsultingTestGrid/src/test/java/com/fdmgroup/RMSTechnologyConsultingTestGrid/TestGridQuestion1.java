package com.fdmgroup.RMSTechnologyConsultingTestGrid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGridQuestion1 {

	int[][] tenTimesTenGrid;

	int combination;

	GridQuestion1 gridQuestion1;

	@BeforeEach
	void setup() throws Exception {

		// Arrange
		gridQuestion1 = new GridQuestion1();
	}

	@Test
	public void test_GetCombinationsOfThreeAdjacentNumbersIn10x10Grid_Return288_whenExampleGridPassedIn() {
		// @formatter:off
		int[][] tenTimesTenGrid = { { 8, 2, 22, 97, 38, 15, 0, 40, 0, 75 }, 
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

		int combination = gridQuestion1.getCombinationsOfThreeAdjacentNumbersIn10x10Grid(tenTimesTenGrid);

		assertEquals(288, combination);
	}

	@Test
	public void test_GetCombinationsOfThreeAdjacentNumbersIn10x10Grid_Return288_whenIfAllZeroPassedIn() {
		// @formatter:off
		int[][] tenTimesTenGrid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, 
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
									 };
		// @formatter:on

		int combination = gridQuestion1.getCombinationsOfThreeAdjacentNumbersIn10x10Grid(tenTimesTenGrid);

		assertEquals(288, combination);
	}

	@Test
	public void test_GetCombinationsOfThreeAdjacentNumbersIn10x10Grid_Return288_whenIfNegativeValuesPassedIn() {
		// @formatter:off
		int[][] tenTimesTenGrid = { { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 }, 
									 { -11, -12, -13, -14, -15, -16, -17, -18, -19, -20 }, 
									 { -21, -22, -23, -24, -25, -26, -27, -28, -29, -30 },
									 { -31, -32, -33, -34, -35, -36, -37, -38, -39, -40 },
									 { -41, -42, -43, -44, -45, -46, -47, -48, -49, -50 },
									 { -51, -52, -53, -54, -55, -56, -57, -58, -59, -60 },
									 { -61, -62, -63, -64, -65, -66, -67, -68, -69, -70 },
									 { -71, -72, -73, -74, -75, -76, -77, -78, -79, -80 },
									 { -81, -82, -83, -84, -85, -86, -87, -88, -89, -90 },
									 { -91, -92, -93, -94, -95, -96, -97, -98, -99, -100 }
									 };
		// @formatter:on

		int combination = gridQuestion1.getCombinationsOfThreeAdjacentNumbersIn10x10Grid(tenTimesTenGrid);

		assertEquals(288, combination);
	}

	@Test
	public void test_GetCombinationsOfThreeAdjacentNumbersIn10x10Grid_Return0_whenIf3x3GridPassedIn() {
		// @formatter:off
		int[][] tenTimesTenGrid = {  { 1, 2, 3 }, 
									 { 4, 5, 6 }, 
									 { 7, 8, 9},
			 							};
		// @formatter:on

		int combination = gridQuestion1.getCombinationsOfThreeAdjacentNumbersIn10x10Grid(tenTimesTenGrid);

		assertEquals(0, combination);
	}
}
