package com.zipeng.exer;

public class Account {
	private int id;// 账号
	private double balance;// 余额
	private double annuallnterestRate;// 年利率

	public Account(int id, double balance, double annuallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}

	public int getId() {
		return id;
	}

	public double getbalance() {
		return balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setId(int id) {

	}

	public void setbalance(double balance) {

	}

	public void setAnnuallnterestRate(double annuallnterestRate) {

	}

	public void withdraw(double amount) {// 取钱
		if (balance <= amount) {
			System.out.println("余额不足，取款失败！");
			return;
		}
		balance -= amount;
		System.out.println("成功取出：" + amount + "元钱");
	}

	public void deposit(double amount) {// 存钱
		if (amount > 0) {
			balance += amount;
			System.out.println("成功存入：" + amount + "元钱");
		}
	}
}
