/*
随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值。
*/
class AriExer {
	public static void main (String[] args){
		int num = 175;
		
		int bai = num/100;
		int shi = num%100/10; //int shi = num/10%10;
		int ge = num%10;
		System.out.println("百号位为：" + bai );
		System.out.println("十号位为：" + shi );
		System.out.println("个号位为：" + ge );
	}
}