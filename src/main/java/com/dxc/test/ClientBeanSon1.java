package com.dxc.test;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientBeanSon1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3710334632287275706L;

	private int age = 20;
	private String name = "小红";
	private Boolean boy = true;
	private List<String> friends = Arrays.asList("王五");

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

	public Boolean getBoy() {
		return boy;
	}

	public void setBoy(Boolean boy) {
		this.boy = boy;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
