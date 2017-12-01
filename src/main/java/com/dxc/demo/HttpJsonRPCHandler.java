package com.dxc.demo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;

/**
 * @ClassName: HttpJsonRPCHandler
 * @Description: 通过netty发布json-rpc服务
 * @author 董先存
 * @date 2017.12.1
 * 
 */
public class HttpJsonRPCHandler extends SimpleChannelInboundHandler<FullHttpRequest> {

	public HttpJsonRPCHandlerImp handler = new HttpJsonRPCHandlerImp();

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		handler.channelRead(ctx, msg);
	}

	@Override
	public void write(ChannelHandlerContext ctx, Object msg,
			ChannelPromise promise) throws Exception {
		super.write(ctx, msg, promise);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		handler.exceptionCaught(ctx, cause);
	}

	public static void writeJSON(ChannelHandlerContext ctx,
			HttpResponseStatus status, Object msg) {
	}

	public static void writeJSON(ChannelHandlerContext ctx, Object msg) {
	}

	@Override
	protected void messageReceived(ChannelHandlerContext ctx,
			FullHttpRequest msg) throws Exception {
		handler.messageReceived(ctx, msg);
	}
}
