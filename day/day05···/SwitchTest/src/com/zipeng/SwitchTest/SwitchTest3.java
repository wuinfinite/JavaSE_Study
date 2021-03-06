/*
  输入2019年的月份和日期，输出当天是该年的第几天。
*/
package com.zipeng.SwitchTest;

import java.util.Scanner;

public class SwitchTest3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入2019年的月份：");
		int month = scan.nextInt();
		System.out.println("请输入2019年的日期：");
		int day = scan.nextInt();
		
		int sumDays = 0;//定义一个变量来保存总天数
		switch(month){
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		System.out.println("2019年"+month+"月"+day+"日"+"是当年的第"+sumDays+"天");
	}

}
