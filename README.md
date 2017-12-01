# JSON-RPC-demo
## JSON-RPC demo

* [服务端](#服务端)
在com.dxc.demo包下为服务端代码，代码中，通过Tomcat容器和Netty两种方式发布服务。
* [客户端](#客户端)
在com.dxc.test包下为客户端测试代码。

## Demo特点：
- 验证了javaBean对象的传输及DTO操作；
- 验证了json字符串比javaBean对象少几个字段这种情况；
- 验证了json字符串比javaBean对象多几个字段这种情况；
- 验证里Collection传输。
