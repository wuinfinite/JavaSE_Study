/*
  输入年、月份、日，输出当天是该年的第几天。
  判断是否是闰年的标准：
  	可以被4整除，但不可以被100整除或
  	可以被400整除
*/
package com.zipeng.SwitchTest;

import java.util.Scanner;

public class SwitchTest4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		System.out.println("请输入日期：");
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
			//判断年份是否是闰年
			if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
				sumDays += 29;
			}else {
				sumDays += 28;
			}
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		System.out.println(year+"年"+month+"月"+day+"日"+"是"+year+"年的第"+sumDays+"天");
	}
}
