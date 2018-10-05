package com.demo;
/**
 * 
 */


/**
 * @author Abdalmassih 5 Oct 2018 14:38:51
 */
public class MyMsgRenderer implements MsgRenderer {

	MsgProvider msgProvider;

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.println(msgProvider.getMsg());
	}

	/**
	 * @return the msgProvider
	 */
	public MsgProvider getMsgProvider() {
		return msgProvider;
	}

	/**
	 * @param msgProvider the msgProvider to set
	 */
	public void setMsgProvider(MsgProvider msgProvider) {
		this.msgProvider = msgProvider;
	}



}
