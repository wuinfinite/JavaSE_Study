import java.util.Scanner;
class IfTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
/*		System.out.println("请输入小鹏的期末考试成绩：（0-100）");
		int grade = scan.nextInt();
		
		if(grade==100){
			System.out.println("奖励一辆BMW");
}else if(grade>80&&grade<=99){
		System.out.println("奖励一台iphone xs max");
}else if(grade>=60&&grade<=80){
		System.out.println("奖励一个ipad");
}else{
		System.out.println("啥也不是");

}
*/
		System.out.println("请输入第一个整数：");//三个整数比较大小并且从小到大排序
		int num1 = scan.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = scan.nextInt();
		System.out.println("请输入第三个整数：");
		int num3 = scan.nextInt();

		if(num1>=num2){
			if(num3<=num2)
				System.out.println("三个整数从小到大排序为" + num3 +" "+num2+" "+num1 );
			else if(num3>num2&&num3<=num1)
				System.out.println("三个整数从小到大排序为" + num2 +" " +num3+" " +num1 );
			else 
				System.out.println("三个整数从小到大排序为" + num2 +" " +num1+" " +num3 );
}else {
			if(num3<=num1)
				System.out.println("三个整数从小到大排序为" + num3 +" "+num1+" "+num2 );
			else if(num3>num1&&num3<=num2)
				System.out.println("三个整数从小到大排序为" + num1 +" " +num3+" " +num2 );
			else 
				System.out.println("三个整数从小到大排序为" + num1 +" " +num2+" "+num3 );
}
}
}