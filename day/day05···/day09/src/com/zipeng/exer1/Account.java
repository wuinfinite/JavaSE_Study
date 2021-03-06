package com.zipeng.exer1;

public class Account {
	private double balance;

	public Account(double init_balance) {
		this.balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		// 存钱操作
		if (amt > 0) {
			balance += amt;
			System.out.println("存钱成功：" + amt);
		}
	}

	public void withdraw(double amt) {
		// 取钱
		if (balance >= amt) {
			balance -= amt;
			System.out.println("取钱成功：" + amt);
		}else{
			System.out.println("余额不足！");
		}

	}
}
