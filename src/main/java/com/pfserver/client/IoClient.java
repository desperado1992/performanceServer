package com.pfserver.client;

import com.pfserver.buffer.SBuffer;
import com.pfserver.client.handler.IoClientHandler;
import com.pfserver.event.Event;
import com.pfserver.server.IoServer;

import com.pfserver.server.handler.IoServerHandler;

/**
 * 
 *      
 *     
 * @author zhuyuping       
 * @version 1.0     
 * @created 2014-3-24 上午11:01:27 
 * @function:服务端接口
 */
public interface IoClient {

	/**
	 * 打开链接通道
	 * @param event
	 * @return
	 */
	IoServer open(Event event,IoServerHandler handler);
	
	/**
	 * 关闭链接通道 并写入历史事件记录
	 * @param event
	 * @return
	 */
	void close(Event event,IoServerHandler handler);
	/**
	 * 链接 并注入返回回调句柄 
	 * @param event
	 * @return
	 */
	IoServerHandler connection(Event event,IoServerHandler handler);
	/**
	 * 发送事件消息 并交给handler回调处理 
	 * @param event
	 * @param handler
	 * @return
	 */
	SBuffer send(Event event,IoServerHandler handler);
	/**
	 * 接收事件消息 response并交给handler 回调处理
	 * @param event
	 * @param handler
	 * @return
	 */
	SBuffer receive(Event event,IoServerHandler handler);
	/**
	 * 或者自身对象的serverPath
	 * @return
	 */
	ClientPath self();
	/**
	 * 处理自身消息 是否遗弃 给用户覆盖实现 比如日志记录错误等等 
	 * @param event
	 */
	void handlerAbandon(Event event,IoClientHandler... handlers);
	
}
