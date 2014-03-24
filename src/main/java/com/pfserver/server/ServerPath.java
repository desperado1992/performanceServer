package com.pfserver.server;
/**
 * 
 *      
 *     
 * @author zhuyuping       
 * @version 1.0     
 * @created 2014-3-24 上午11:19:45 
 * @function:上下文树的关系 复合模式
 */
public class ServerPath {

	private String path;
	
	private ServerPath parent;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ServerPath getParent() {
		return parent;
	}

	public void setParent(ServerPath parent) {
		this.parent = parent;
	}

	public ServerPath() {
		super();
	
	}
	
	
	
}
