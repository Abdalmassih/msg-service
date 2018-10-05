package com.demo;
/**
 * @author Abdalmassih 
 * 5 Oct 2018  15:53:23
 */


import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory factory;
	private Properties props;
	private MsgRenderer renderer;
	private MsgProvider provider;

	public MessageSupportFactory() {
		props = new Properties();
		try {
			props.load(this.getClass().getResourceAsStream("/WeekDay/msf.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			
//			System.out.println(rendererClass);
			renderer = (MsgRenderer) Class.forName(rendererClass).newInstance();
			provider = (MsgProvider) Class.forName(providerClass).newInstance();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	static {
		factory = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return factory;
	}

	/**
	 * @return the renderer
	 */
	public MsgRenderer getRenderer() {
		return renderer;
	}

	/**
	 * @param renderer
	 *                     the renderer to set
	 */
	public void setRenderer(MsgRenderer renderer) {
		this.renderer = renderer;
	}

	/**
	 * @return the provider
	 */
	public MsgProvider getProvider() {
		return provider;
	}

	/**
	 * @param provider
	 *                     the provider to set
	 */
	public void setProvider(MsgProvider provider) {
		this.provider = provider;
	}
}
