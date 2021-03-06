package com.zipeng.p2.service;

import com.zipeng.p2.bean.Customer;

/**
 * 
*
* @Descrpition CustomerList为Customer对象的管理模块，
* 内部用数据管理一组Customer对象，并提出相应的添加、修改、删除、
* 和遍历方法，供CustomerView调用
* @author zipeng   Email：zipeng@555.com
* @version
* @date  2022年4月23日下午12:50:41
*
 */
public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total = 0;//用来记录客户对象的数量
	
	
	/**
	 * 用来初始化customer数组的构造器
	 * @param totalCustomer：指定数组的长度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * 
	* @Descrpition 将指定的用户添加到数组中
	* @author zipeng   
	* @date  2022年4月23日下午1:37:41
	*  @param customer
	*  @return true：添加成功  false：添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length){
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * 
	* @Descrpition 修改指定索引位置的客户信息
	* @author zipeng   
	* @date  2022年4月23日下午2:07:02
	*  @param index
	*  @param cust
	*  @return
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index <0 || index >= total){
			return false;
		}
		customers[index] = cust;
		return true;
	}
	
	/**
	 * 
	* @Descrpition 删除指定索引位置的客户信息
	* @author zipeng   
	* @date  2022年4月23日下午2:06:26
	*  @param index
	*  @return
	 */
	public boolean deleteCustomer(int index) {
		if(total >= customers.length){
			return false;
		}
		for(int i = index;i < total - 1; i++)
		{
			customers[i] = customers[i + 1];//删除后需要覆盖空位
		}
		//最后有数据的元素置空
		//customers[total - 1] = null;
		//total--;或者
		customers[--total] = null;
		return true;
	}
	
	/**
	 * 
	* @Descrpition 获取所有客户信息
	* @author zipeng   
	* @date  2022年4月23日下午2:24:41
	*  @return
	 */
	public  Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for(int i = 0;i < total; i++){
			custs[i] = customers[i];
		}
		return custs;
	}
	
	/**
	 * 
	* @Descrpition 获取指定索引客户信息
	* @author zipeng   
	* @date  2022年4月23日下午2:35:20
	*  @param index
	*  @return 找到了元素返回，没找到返回null
	 */
	public  Customer getCustomers(int index) {
		if(index <0 || index >= total){
			return null;
		}
		return customers[index];
	}
	
	/**
	 * 
	* @Descrpition 获取存储客户的数量
	* @author zipeng   
	* @date  2022年4月23日下午2:38:17
	*  @return
	 */
	public int getTotal() {
		return total;
	}
	
	
}
