package com.zipeng.exer1;
//递归

//f(n) = f(n-1) + f(n-2)
public class RecursionTest {
	public static void main(String[] args) {
		RecursionTest test = new RecursionTest();
		
		System.out.println(test.f(10));
		
	}
	
	public int f(int n){
		if(n == 0){
			return 1;
		}else if(n == 1){
			return 4;
		}else{
			return f(n-1) + f(n-2);
		}
		
	}
	
}
