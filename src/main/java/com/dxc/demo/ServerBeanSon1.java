package com.dxc.demo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class ServerBeanSon1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3710334632287275706L;

	private int age = 18;
	private String name = "小明";
	private String address = "山东";
	private List<String> friends = Arrays.asList("张三", "李四");

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
