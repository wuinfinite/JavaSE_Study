package com.zipeng.exer;

public class CustomerTest {
	public static void main(String[] args) {

		Customer cust = new Customer("Jane", "Smith");

		Account acct = new Account(1000, 2000, 0.0123);

		cust.setAccount(acct);// 关联用户和账号

		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(1500);
		System.out.println(cust.getAccount().getAnnuallnterestRate() * 100 + "%");

	}
}
