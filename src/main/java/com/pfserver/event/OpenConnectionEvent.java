package com.pfserver.event;

import java.net.InetSocketAddress;

/**
 * 
 *      
 *     
 * @author zhuyuping       
 * @version 1.0     
 * @created 2014-3-24 上午11:55:52 
 * @function:打开连接事件 主要封装连接的信息 
 */
public class OpenConnectionEvent implements Event{

	/**
	 * 远程连接的地址 
	 */
	private  InetSocketAddress address;
	//XXX 后面需要添加集群分布式机制 

	

	public InetSocketAddress getAddress() {
		return address;
	}

	public void setAddress(InetSocketAddress address) {
		this.address = address;
	}

	public OpenConnectionEvent(InetSocketAddress address) {
		super();
		this.address = address;
	}
	
	
	
	
	
}
