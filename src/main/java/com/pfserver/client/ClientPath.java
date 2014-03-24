package com.pfserver.client;


/**
 * 
 *      
 *     
 * @author zhuyuping       
 * @version 1.0     
 * @created 2014-3-24 下午4:31:56 
 * @function:
 */
public class ClientPath {

   private String path;
	
	private ClientPath parent;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ClientPath getParent() {
		return parent;
	}

	public void setParent(ClientPath parent) {
		this.parent = parent;
	}

	public ClientPath() {
		super();
	
	}
	
	
}
