package com.zipeng.ForTest;

public class ForTest2 {
	public static void main(String[] args) {
		
		
		for(int i=1;i<=150;i++){
			if(i % 3 == 0){
				System.out.println(i+"\tfoo");
			}else if(i % 5 == 0){
				System.out.println(i+"\tbiz");
			}else if(i % 7 == 0){
				System.out.println(i+"\tbaz");
			}else{
				System.out.println(i);
			}
		}
	}
}
