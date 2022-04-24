package com.zipeng.exer;

public class ArryExer1 {
	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 2, 3 }, { 11 }, { 4, 8, 2 } };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("总和为：" + sum);
		
		//int[]x,y[];  x 一维数组 ，y 二维数组   
	}

}
