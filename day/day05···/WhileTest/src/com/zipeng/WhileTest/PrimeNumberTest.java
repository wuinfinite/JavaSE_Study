package com.zipeng.WhileTest;
//100000以内质数的输出个数
public class PrimeNumberTest {
	public static void main(String[] args) {
/*	方法一
	//获取当前时间距离1970-01-01 00:00:00的毫秒数
		long start = System.currentTimeMillis();
		
		int count = 0;
		boolean isFlag = true;
		for(int i = 2; i <= 100000 ; i++){
			//for(int j= 2;j <= i; j++)
			for(int j = 2;j <= Math.sqrt(i);j++){//优化二：Math.sqrt()减少循环次数
				if(i % j == 0){
					isFlag = false;
					break;//优化一：只对非质数有效
				}
			}
			if(isFlag){
				//System.out.println(i);
				count++;
			}
			isFlag = true;//重置isFlag
		}
		long end = System.currentTimeMillis();
		System.out.println("质数个数为：" + count);
		System.out.println("所花费的时间：" +(end-start));
*/
		//方法二
		long start = System.currentTimeMillis();
		int count = 0;
		label:for(int i = 2; i <= 100000 ; i++){
				for(int j = 2;j <= Math.sqrt(i);j++){
					if(i % j == 0){
					continue label;
					}
				}
				count++;
		}
		long end = System.currentTimeMillis();
		System.out.println("质数个数为：" + count);
		System.out.println("所花费的时间：" +(end-start));
	}

}
