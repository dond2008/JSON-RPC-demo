package com.dxc.demo;

public interface DemoService {

	public ServerBean getDemo(String code, String msg);

	public Integer getInt(Integer code);

	public String getString(String msg);

	public void doSomething();
}
