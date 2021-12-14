package com.ibs.leetcode2;

import java.util.Arrays;

public class MatrixDiogonalSort {

	public int[][] diagonalSort(int[][] mat) {
		int y = mat.length;
		int x = mat[0].length - 1;
		int[] diag = new int[y];

		for (int i = 2 - y; i < x; i++) {
			int k = 0;
			for (int j = 0; j < y; j++)
				if (i + j >= 0 && i + j <= x)
					diag[k++] = mat[j][i + j];
			Arrays.sort(diag, 0, k);

			k = 0;
			for (int j = 0; j < y; j++)
				if (i + j >= 0 && i + j <= x)
					mat[j][i + j] = diag[k++];
		}

		return mat;
	}

	public static void main(String[] args) {
		MatrixDiogonalSort mds = new MatrixDiogonalSort();
		int[][] mat = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
		int[][] mat2 = mds.diagonalSort(mat);
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[0].length; j++)
				System.out.print(mat2[i][j]);
			System.out.println();
		}

	}
}
