package com.dxc.test;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.jsonrpc4j.JsonRpcHttpClient;

public class JsonRpcTest {
	static JsonRpcHttpClient client;

	public JsonRpcTest() {

	}

	public static void main(String[] args) throws Throwable {
		// 实例化请求地址，注意服务端web.xml中地址的配置
		try {
			client = new JsonRpcHttpClient(new URL("http://127.0.0.1:8400"));
			// 请求头中添加的信息
			Map<String, String> headers = new HashMap<String, String>();
			headers.put("Rpc-Type", "shop");
			// 添加到请求头中去
			client.setHeaders(headers);
			JsonRpcTest test = new JsonRpcTest();
			test.doSomething();
			ClientBean demo = test.getDemo(1, "哈");
			ClientBean demo2 = test.getDemo2(demo, "demo2222");
			int code = test.getInt(2);
			String msg = test.getString("哈哈哈");
			// print
			System.out.println("===========================javabean");
			System.out.println(demo.getCode());
			System.out.println(demo.getMsg());
			System.out.println("===========================javabean2");
			System.out.println(demo2.getCode());
			System.out.println(demo2.getMsg());
			System.out.println(demo2.getSon1().getName());
			System.out.println(demo2.getSon1().getBoy());
			System.out.println(demo2.getSon1().getFriends());
			for (ClientBeanSon1 son : demo2.getSons()) {
				System.out.println(son.getFriends());
			}
			System.out.println("===========================Integer");
			System.out.println(code);
			System.out.println("===========================String");
			System.out.println(msg);
			System.out.println("===========================end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void doSomething() throws Throwable {
		client.invoke("doSomething", null);
	}

	public ClientBean getDemo2(ClientBean bean, String msg) throws Throwable {
		Object[] params = new Object[] { msg };
		ClientBean demo = null;
		demo = client.invoke("getDemo2", params, ClientBean.class);
		return demo;
	}

	public ClientBean getDemo(int code, String msg) throws Throwable {
		String[] params = new String[] { String.valueOf(code), msg };
		ClientBean demo = null;
		demo = client.invoke("getDemo", params, ClientBean.class);
		return demo;
	}

	public int getInt(int code) throws Throwable {
		Integer[] codes = new Integer[] { code };
		return client.invoke("getInt", codes, Integer.class);
	}

	public String getString(String msg) throws Throwable {
		String[] msgs = new String[] { msg };
		return client.invoke("getString", msgs, String.class);
	}

}
