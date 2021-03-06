package com.zipeng.exer;
/*
 * 对StudentTest的改进
 */
public class StudentTest1 {
	public static void main(String[] args) {
		Student1[] stus = new Student1[20];
		
		for(int i = 0; i < stus.length; i++){
			stus[i] = new Student1();
			stus[i].number = (i + 202001);
			stus[i].state = (int)(Math.random() *6 + 1);
			stus[i].score = (int)(Math.random()*100 + 1);
		}
		//new一个对象
		StudentTest1 test = new StudentTest1();
		//遍历学生数组操作
		test.print(stus);
		System.out.println("************************");
		
		//输出年级为三的学生信息
		test.searchState(stus, 3);
		System.out.println("************************");
		
		//冒泡排序学生成绩,并遍历学生所有成绩
		test.sort(stus);
		//遍历学生数组操作
		test.print(stus);
	}

	/**
	 * 
	* @Descrpition 遍历Student1数组操作
	* @author zipeng   
	* @date  2022年4月20日下午7:28:21
	*  @param stus
	 */
		public void print(Student1[] stus){
			for(int i = 0; i < stus.length; i++){
				System.out.println(stus[i].info());
			}
		}
	
	/**
	 * 
	* @Descrpition  寻找Student1数组指定年级的学生信息
	* @author zipeng   
	* @date  2022年4月20日下午7:19:01
	*  @param stus 要查找的数组
	*  @param state 要查找的年级
	 */
		public void searchState(Student1[] stus,int state){
			for(int i = 0; i < stus.length; i++){
				if(stus[i].state == state){
					System.out.println(stus[i].info());
				}
			}
		}
		
		/**
		 * 
		*
		* @Descrpition 使用冒泡排序给Student1数组排序
		* @author zipeng   Email：zipeng@555.com
		* @version
		* @date  2022年4月20日下午7:25:01
		*
		 */
		public void sort(Student1[] stus){
			for(int i = 0; i< stus.length -1; i++){
				for(int j = 0; j < stus.length-1-i; j++){
					if(stus[j].score > stus[j+1].score){
						Student1 temp = stus[j];
						stus[j] = stus[j+1];
						stus[j+1] = temp;
					}
				}
			}
		}
}
class Student1{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	public String info(){
		return "学号：" + number + ",年级：" + state + ",成绩：" + score; 
	}
}