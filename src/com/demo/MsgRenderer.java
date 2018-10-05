package com.demo;
/**
 * 
 */

/**
 * @author Abdalmassih 5 Oct 2018 14:36:08
 */
public interface MsgRenderer {
	MsgProvider getMsgProvider();

	void setMsgProvider(MsgProvider msgProvider);

	void render();

}
