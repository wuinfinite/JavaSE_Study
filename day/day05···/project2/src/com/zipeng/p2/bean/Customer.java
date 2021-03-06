package com.zipeng.p2.bean;
/**
 * 
*
* @Descrpition Customer为实体对象 封装客户信息
* @author zipeng   Email：zipeng@555.com
* @version
* @date  2022年4月23日下午12:46:47
*
 */
public class Customer {
	private String name;
	private char gender;//性别
	private int age;
	private String phone;
	private String email;
	
	public Customer(String name, char gender, int age, String phone, String email) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public Customer() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}

}
