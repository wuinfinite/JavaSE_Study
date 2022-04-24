package com.zipeng.exer;
//二分查找
public class ArryExer2 {
	public static void main(String[] args) {
		
		int[] arry1 = new int[]{-12,-3,0,5,8,15,62,70};
		int dest1 = 11;
		int head = 0;//初始索引
		int end = arry1.length - 1;
		boolean isFlag = true;
		
		while(head <= end){
			
			int middle = (head + end)/2;
			
			if(dest1 == arry1[middle]){
				System.out.println("找到了指定元素，位置为：" + middle);
				isFlag = false;
				break;
			}else if(dest1 < arry1[middle]){
				end = middle -1;
			}else{
				head = middle + 1;
			}
		}
		if(isFlag == true){
			System.out.println("没有找到！");
		}
	}
}
