package com.zipeng.java;

import java.util.Arrays;

//数组的冒泡排序

public class BubbleSortTest {
	public static void main(String[] args) {
		int arr[] = new int[]{-21,32,0,76,-3,6,8,88,6685,82,1,3};
		
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				
				if(arr[j] > arr[j+1]){}
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
						
			}
		 }
		//System.out.println(Arrays.toString(arr));
	}
}
