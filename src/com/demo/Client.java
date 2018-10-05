package com.demo;
/**
 * 
 */

/**
 * @author Abdalmassih 5 Oct 2018 13:24:25
 */
public class Client {
	public static void main(String... args) {
		new MessageSupportFactory();
		MsgRenderer msgRenderer = MessageSupportFactory.getInstance().getRenderer();
		MsgProvider msgProvider = MessageSupportFactory.getInstance().getProvider();
		msgRenderer.setMsgProvider(msgProvider);
		msgRenderer.render(); 

		// String name = msgRenderer.getClass().getSimpleName();
		// System.out.println(name);
	}
}
