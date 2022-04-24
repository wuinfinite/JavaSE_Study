package com.zipeng.java;

public class ArrayTest {
	public static void main(String[] args) {

		int[] ids;// 声明
		// 静态初始化
		ids = new int[] { 1001, 1002, 1003, 1004 };
		// 动态初始化
		String[] names = new String[3];

		names[0] = "小明";
		names[1] = "小红";
		names[2] = "小可爱";// charAt(0)

		System.out.println(names.length);
		System.out.println(ids.length);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
