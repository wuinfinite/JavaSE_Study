package com.zipeng.ForTest;

/*
输出1000以内所有的完数     6=1+2+3
*/
public class ForTest4 {
	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			int factor = 0;
			for (int j = 1; j <= i / 2; j++) {// 优化j<i
				if (i % j == 0) {
					factor += j;
				}
			}
			if (i == factor) {
				System.out.println(i);
			}
		}
	}

}
