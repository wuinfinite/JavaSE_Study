package com.zipeng.exer1;

public class Bank {
	private Customer[] customers;//存放多个客户的数组
	private int numberOfCustomers;//记录客户的个数
	
	public Bank(){
		customers = new Customer[10]; 
	}
	
	public void addCustomer(String f,String l){
		Customer cust = new Customer(f,l);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;
	}
	
	public int getNumOfCustomers(){//获取客户个数
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index){//获取指定位置的客户
		if(index >= 0 && index < numberOfCustomers){
			return customers[index];
		}
		return null;
	}
}
