class StringTest{
	public static void main(String[] args){
		String s1 = "HelloWorld!";
		System.out.println(s1);

		int number = 05;
		String numberStr = "学号：";
		String info = numberStr + number;//+：连接运算
		System.out.println(info);

		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);
		
		//练习1
		char c = 'a';//97
		int num = 10;
		String str = "hello";
		System.out.println(c+num+str);//107hello
		System.out.println(c+str+num);//ahello10
		System.out.println(c+(num+str));//a10hello
		System.out.println((c+num)+str);//107hello
		System.out.println(str+num+c);//hello10a

		//练习2
		System.out.println("*  *");//*  *
		System.out.println('*' + '\t' + '*');//93
		System.out.println('*' + "\t" + '*');//*      *
		System.out.println('*' + '\t' + "*");//51*
		System.out.println('*' + ('\t' + "*"));//*      *
	}
}