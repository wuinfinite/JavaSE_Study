package com.zipeng.java;

public class ArraryTest1 {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};//一维数组
		
		String[][] arr2 = new String[][]{{"wo","i"},{"java"}};
		String[][] arr3 = new String[2][4];//动态初始化1
		String[][] arr4 = new String[2][];//动态初始化2
		
		arr4[0] = new String[2];
		System.out.println(arr4[0][1]);
	}

}
