package com.pfserver.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;

import java.util.Map;

import com.google.common.collect.Maps;
import com.pfserver.event.Event;
import com.pfserver.event.OpenConnectionEvent;
import com.pfserver.server.handler.IoServerHandler;

/**
 * 
 *      
 *     
 * @author zhuyuping       
 * @version 1.0     
 * @created 2014-3-24 上午10:58:15 
 * @function:服务端的抽象接口
 */
public abstract class AbstractServer implements IoServer{

	
	
	private Map<ServerPath,IoServer> servers=Maps.newConcurrentMap();
	
	private ServerBootstrap bootstrap;
	
	public AbstractServer() {
		super();
		
	}

	//XXX 后面需要改成消息通知机制 来处理者server的并发问题
	public void add(IoServer server){
		servers.put(server.self(), server);
	}
	
	public void remove(IoServer server){
		servers.remove(server.self());
	}

//	@Override
//	public IoServer open(Event event) {
//		if(event instanceof OpenConnectionEvent){
//			OpenConnectionEvent evt=(OpenConnectionEvent) event;
//			//evt.getAddress();
//		}else 
//			handlerAbandon(event);
//		
//		return null;
//	}

	

	
	
	
	
	
	
	
}
