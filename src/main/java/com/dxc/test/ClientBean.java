package com.dxc.test;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ClientBean implements Serializable{
	private static final long serialVersionUID = -5141784402935371524L;
	private int code;
	private String msg;
	private String msg2;
	private ClientBeanSon1 son1;
	private List<ClientBeanSon1> sons;

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

	public String getMsg2() {
		return msg2;
	}

	public void setMsg2(String msg2) {
		this.msg2 = msg2;
	}

	public ClientBeanSon1 getSon1() {
		return son1;
	}

	public void setSon1(ClientBeanSon1 son1) {
		this.son1 = son1;
	}

	public List<ClientBeanSon1> getSons() {
		return sons;
	}

	public void setSons(List<ClientBeanSon1> sons) {
		this.sons = sons;
	}
}
