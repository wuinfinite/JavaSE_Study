import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入你的姓名：");
		String name = scan.next();
		System.out.println(name);

		System.out.println("请输入你的芳龄：");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);

	}
}
