package com.zipeng.SwitchTest;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个小写字母：");
		String word = scan.next();
		char c = word.charAt(0);
		switch(c){
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		default:
			System.out.println("other");
		}
	}
}
