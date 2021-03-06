package com.zipeng.exer1;
/*
 * 银行账户测试
 */
public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCustomer("Jane","Smith");
		
		//new一个账户初始化余额2000
		bank.getCustomer(0).setAccount(new Account(2000));
		
		//客户1存钱200
		bank.getCustomer(0).getAccount().deposit(200);
		
		//客户1取钱700
		bank.getCustomer(0).getAccount().withdraw(700);
		
		//获取客户1的余额
		double s = bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("余额为：" + s);
	}
}
