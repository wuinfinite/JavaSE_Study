class VariableTest1{
	public static void main(String[] args){
/*
自动类型提升
*/
		byte b1 = 2;
		int i1 = 129;
		int i2 = b1+i1;
		long l1 = b1+i1;
		System.out.println(i2);
		System.out.println(l1);
		
		float f = b1+i1;
		System.out.println(f);
		
		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);
/*
强制类型转换
*/
		double d2 = 12.9;
		int i3 = (int)d2;//截断操作
		System.out.println(i3);
	}
}