class AriTest {
	public static void main(String[] args){
		int num1 = 12;
		int num2 = 5;
		double result = num1/num2 + 0.0; //2.0
		double result2 = num1/(num2 + 0.0); //2.4
		double result3 = (double)num1/num2; //2.4
		double result4 = (double)(num1/num2); //2.0
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);


	}
}