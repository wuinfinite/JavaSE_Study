package com.zipeng.java;

public class CheckAccountTest {
	
	public static void main(String[] args) {
		CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
		acct.withdrw(5000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支额度为：" + acct.getOverdraft());
		
		acct.withdrw(18000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支额度为：" + acct.getOverdraft());
		
		acct.withdrw(3000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支额度为：" + acct.getOverdraft());
	}
}
