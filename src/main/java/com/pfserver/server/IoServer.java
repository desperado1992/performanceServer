package com.pfserver.server;

import com.pfserver.buffer.SBuffer;
import com.pfserver.client.IoClient;
import com.pfserver.client.handler.IoClientHandler;
import com.pfserver.event.Event;
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
public interface IoServer {
    /**
     * 
     * @param event
     * @param handler
     * @return 接收来自客服端的请求并返回句柄
     */
	IoClient accept(Event event,IoClientHandler handler);
	/**
	 * 
	 * @param event
	 * @param handler
	 * @return 接收accept后 回复receive
	 */
	SBuffer receive(Event event,IoServerHandler handler);
	/**
	 * 或者自身对象的serverPath
	 * @return
	 */
	ServerPath self();
	/**
	 * 处理自身消息 是否遗弃 给用户覆盖实现 比如日志记录错误等等 
	 * @param event
	 */
	void handlerAbandon(Event event,IoServerHandler... handlers);
	
	
	
	
}
