package com.dxc.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoServiceImply {

	public ServerBean getDemo2(String msg) {
		ServerBean bean1 = new ServerBean();
		bean1.setCode(999);
		bean1.setMsg("666");
		ServerBeanSon1 son1 = new ServerBeanSon1();
		son1.setName("dxc");
		son1.setFriends(Arrays.asList("calvin", "Li Lei"));
		bean1.setSon1(son1);
		List<ServerBeanSon1> sons = new ArrayList<ServerBeanSon1>();
		ServerBeanSon1 son2 = new ServerBeanSon1();
		sons.add(son1);
		sons.add(son2);
		bean1.setSons(sons);
		return bean1;
	}

	public ServerBean getDemo(String code, String msg) {
		ServerBean bean1 = new ServerBean();
		bean1.setCode(Integer.parseInt(code));
		bean1.setMsg(msg);
		return bean1;
	}

	public Integer getInt(Integer code) {
		return code;
	}

	public String getString(String msg) {
		return msg;
	}

	public void doSomething() {
		System.out.println("do something");
	}

}
