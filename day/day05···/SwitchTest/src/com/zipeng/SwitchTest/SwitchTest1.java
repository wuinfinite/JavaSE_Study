package com.zipeng.SwitchTest;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的分数：");
		int score = scan.nextInt();
		
/*		switch(score/10){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不合格");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("合格");
		default:
			break;
		}
*/
		switch(score/60){
		case 0:
		System.out.println("不合格");
		break;
		case 1:
		System.out.println("合格");
		break;
		default:
		break;
		}
/*
		if(score>=60){
			System.out.println("合格");
		}else if(score<60&&score>=0){
			System.out.println("不合格");
		}
*/
		
	}

}
