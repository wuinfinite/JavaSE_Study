package com.zipeng.exer;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		// 使用Scanner，读取学生个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int number = scanner.nextInt();

		// 创建数组，存储学生人数
		int[] scores = new int[number];
		int maxScore = 0;// 给数组中的元素赋值

		System.out.println("请输入" + number + "个学生成绩：");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
			if (maxScore <= scores[i]) {
				maxScore = scores[i];// 获取数组中的元素的最大值
			}
		}

		// 根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
		char level;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore - scores[i] <= 10) {
				level = 'A';
			} else if (maxScore - scores[i] <= 20) {
				level = 'B';
			} else if (maxScore - scores[i] <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("学生" + (i + 1) + "的分数为：" + scores[i] + "\t以及等级为：" + level);
		}

	}
}