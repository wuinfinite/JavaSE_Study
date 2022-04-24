package com.zipeng.exer;

public class Exer1Test {
	public static void main(String[] args) {
		Exer1Test test = new Exer1Test();

		// System.out.println(test.method(12, 3));
		int area = test.method(12, 3);
		System.out.println("面积为：" + area);
	}

	public int method(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m * n;
	}
}