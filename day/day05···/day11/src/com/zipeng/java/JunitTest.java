package com.zipeng.java;

import org.junit.Test;

//java中的单元测试

public class JunitTest {
	@Test
	
	public void testEquals(){
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
	}
}