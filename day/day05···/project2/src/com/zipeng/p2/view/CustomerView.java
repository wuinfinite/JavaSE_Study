package com.zipeng.p2.view;

import javax.xml.crypto.dsig.CanonicalizationMethod;

import com.zipeng.p2.bean.Customer;
import com.zipeng.p2.service.CustomerList;
import com.zipeng.p2.util.CMUtility;

/**
 * 
 *
 * @Descrpition CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author zipeng Email：zipeng@555.com
 * @version
 * @date 2022年4月23日下午12:55:13
 *
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);

	public CustomerView(){
		Customer customer = new Customer("王名", '男', 20, "18215152264", "wm@123.com");
		customerList.addCustomer(customer);
	}
	/**
	 * 
	 * @Descrpition 显示《客户信息管理软件》界面的方法
	 * @author zipeng
	 * @date 2022年4月23日下午2:52:21
	 */
	private void enterMainMenu() {

		boolean isFalg = true;
		while (isFalg) {
			System.out.println("\n------------客户信息管理软件---------");
			System.out.println("              1.添加客户");
			System.out.println("              2.修改客户");
			System.out.println("              3.删除客户");
			System.out.println("              4.客户列表");
			System.out.println("              5.退出\n");
			System.out.print("              请选择(1-5)：");

			char mean = CMUtility.readMenuSelection();
			switch (mean) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomer();
				break;
			case '5':
				System.out.println("退出");

				System.out.println("确认是否退出(Y/N)：");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFalg = false;
				}
			}

		}
	}

	/**
	 * 
	 * @Descrpition 添加客户的操作
	 * @author zipeng
	 * @date 2022年4月23日下午2:52:21
	 */
	private void addNewCustomer() {
		//System.out.println("添加客户的操作");
		System.out.println("-------------添加客户的操作---------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		
		System.out.println("电话：");
		String phone = CMUtility.readString(11);
		
		System.out.println("邮箱：");
		String email = CMUtility.readString(30);
		
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess){
			System.out.println("-----------添加完成--------------------");
		}else{
			System.out.println("------客户目录已满，添加失败--------");
		}
		
	}

	/**
	 * 
	 * @Descrpition 修改客户的操作
	 * @author zipeng
	 * @date 2022年4月23日下午2:52:21
	 */
	private void modifyCustomer() {
		//System.out.println("修改客户的操作");
		System.out.println("----------------------修改客户--------------------------");
		
		Customer cust;//外面声明
		int number;
		for(;;){
			System.out.println("请选择带修改客户的编号(-1退出)");
			number = CMUtility.readInt();
			
			if(number == -1){
				return;
			}
			 cust = customerList.getCustomers(number - 1);
			if(cust == null){
				System.out.println("无法找到指定客户！");
			}else{//找到客户了，防止再循环,跳出写
				break;
			}
		}
		//修改客户信息
		System.out.println("姓名(" + cust.getName() +"):");
		String name = CMUtility.readString(10, cust.getName());
		
		System.out.println("性别(" + cust.getGender() +"):");
		char gender = CMUtility.readChar(cust.getGender());
		
		System.out.println("年龄(" + cust.getAge()+"):");
		int age = CMUtility.readInt(cust.getAge());
		
		System.out.println("电话(" + cust.getPhone()+"):");
		String phone = CMUtility.readString(11, cust.getPhone());
		
		System.out.println("邮箱(" + cust.getemail() +"):");
		String email = CMUtility.readString(30, cust.getemail());
			
		Customer newCust = new Customer(name, gender, age, phone, email);
		
		boolean isRepalaced = customerList.replaceCustomer(number - 1, newCust);
		if(isRepalaced){
			System.out.println("----------------------修改完成--------------------------");
		}else{
			System.out.println("----------------------修改失败--------------------------");
		}
	}

	/**
	 * 
	 * @Descrpition 删除客户的操作
	 * @author zipeng
	 * @date 2022年4月23日下午2:52:21
	 */
	private void deleteCustomer() {
		//System.out.println("删除客户的操作");
		System.out.println("----------------------删除客户--------------------------");
		
		for(;;){
			System.out.println("请选择带删除客户的编号(-1退出)");
			int number = CMUtility.readInt();
			
			if(number == -1){
				return;
			}
			Customer customer =  customerList.getCustomers(number - 1);
			if(customer == null){
				System.out.println("无法找到指定客户！");
			}else{
				break;
			}
			
			System.out.println("确认是否删除(Y/N)：");
			char isDelete = CMUtility.readConfirmSelection();
			if(isDelete == 'Y'){
				boolean deleteSuccess = customerList.deleteCustomer(number - 1);
				if(deleteSuccess){
					System.out.println("----------------------删除成功--------------------------");
				}else{
					System.out.println("----------------------删除失败--------------------------");
				}
			}else{
				return;
			}
		}
		
	}

	/**
	 * 
	* @Descrpition 显示客户的操作	
	* @author zipeng   
	* @date  2022年4月23日下午2:52:21
	 */
	private void listAllCustomer(){
		System.out.println("显示客户的操作");
		System.out.println("----------------------客户列表--------------------------");
		
		int total = customerList.getTotal();
		if(total == 0){
			System.out.println("没有客户记录！");
		}else{
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0;i < custs.length; i++){
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t"+cust.getName()+"\t"+cust.getGender()
				+"\t"+ cust.getAge()+"\t"+cust.getPhone()+"\t"+cust.getemail());
			}
		}
		
		System.out.println("---------------------客户列表完成--------------------------");
	}

	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
}
