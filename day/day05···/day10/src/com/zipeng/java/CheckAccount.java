package com.zipeng.java;

public class CheckAccount extends Account{
	private double overdraft;//可透支限额
	
	public CheckAccount(int id, double balance, double annuallnterestRate,double overdraft){
		super(id, balance, annuallnterestRate);
		this.overdraft = overdraft;
		
	}
	
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	@Override
	public void withdrw(double amount) {
		if(getBalance() >= amount){
			//方式一
			//setBalance(getBalance() - amount);
			//方式二
			super.withdrw(amount);
		}else if(overdraft >= amount - getBalance()){
			overdraft -= (amount - getBalance());
			
			//setBalance(0);方式一
			super.withdrw(getBalance());//方式二
		}else {
			System.out.println("超过可透支限额！");
		}
	}
}
