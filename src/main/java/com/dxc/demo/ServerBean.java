package com.dxc.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServerBean implements Serializable{
	private static final long serialVersionUID = -5141784402935371524L;
	private int code;
	private String msg;
	private ServerBeanSon1 son1;
	private List<ServerBeanSon1> sons =  new ArrayList<ServerBeanSon1>();

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ServerBeanSon1 getSon1() {
		return son1;
	}

	public void setSon1(ServerBeanSon1 son1) {
		this.son1 = son1;
	}

	public List<ServerBeanSon1> getSons() {
		return sons;
	}

	public void setSons(List<ServerBeanSon1> sons) {
		this.sons = sons;
	}
}
