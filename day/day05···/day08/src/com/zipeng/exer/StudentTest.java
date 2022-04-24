package com.zipeng.exer;

public class StudentTest {
	public static void main(String[] args) {
		Student[] stus = new Student[20];
		
		for(int i = 0; i < stus.length; i++){
			stus[i] = new Student();
			stus[i].number = (i + 202001);
			stus[i].state = (int)(Math.random() *6 + 1);
			stus[i].score = (int)(Math.random()*100 + 1);
		}
		for(int i = 0; i < stus.length; i++){
			System.out.println(stus[i].info());
		}
		System.out.println("************************");
		
		//输出年级为三的学生信息
		for(int i = 0; i < stus.length; i++){
			if(stus[i].state == 3){
				System.out.println(stus[i].info());
			}
		}
		
		System.out.println("************************");
		
		//冒泡排序学生成绩,并遍历学生所有成绩
		for(int i = 0; i< stus.length -1; i++){
			for(int j = 0; j < stus.length-1-i; j++){
				if(stus[j].score > stus[j+1].score){
					Student temp = stus[j];
					stus[j] = stus[j+1];
					stus[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < stus.length; i++){
			System.out.println(stus[i].info());
		}
	}
}

class Student{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	public String info(){
		return "学号：" + number + ",年级：" + state + ",成绩：" + score; 
	}
}