package com.pfserver.state;

import akka.actor.UntypedActor;
/**
 * 
 *      
 *     
 * @author zhuyuping       
 * @version 1.0     
 * @created 2014-3-20 下午5:43:00 
 * @function:状态机  State(S) x Event(E) -> Actions (A), State(S’) If we are in state S and the event E occurs, we should perform the actions A and make a transition(过渡) to the state S’.
 */
public abstract class AbstractFSMstate extends UntypedActor{

	@Override
	public void onReceive(Object message) throws Exception {
	
		
	} 


}
