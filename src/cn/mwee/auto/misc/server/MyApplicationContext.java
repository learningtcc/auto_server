package cn.mwee.auto.misc.server;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


@SuppressWarnings("static-access")
public class MyApplicationContext {
	private Logger log = LoggerFactory.getLogger(MyApplicationContext.class);
	
	private static ApplicationContext ctx;
	private static MyApplicationContext instance = null;
	
	static
	{
		/* 加载 log4j2 配置文件 */
		//String log4jCfgFile = ServicesServer.class.getResource("/").getFile().toString() + "../conf/log4j2.xml";
		
		File file = new File("conf/log4j2.xml");
		System.setProperty("log4j.configurationFile", file.getAbsolutePath());
	}
	
	public static MyApplicationContext getInstance(){
		if(instance==null){
			synchronized(MyApplicationContext.class){
				if(instance==null){
					instance=new MyApplicationContext();
				}
			}
		}
		
		return instance;
	}
	
	private MyApplicationContext() {
		initCtx();
	}
	
	private void initCtx(){
		try{
			if(ctx == null) {
				/*
				String location = null;
				if(System.getProperty("os.name").toLowerCase().contains("windows")){
					location = "conf/applicationContext.xml";
				}else{
					location = "../conf/applicationContext.xml";
				}
				*/
				String location = "conf/applicationContext.xml";
				File file = new File(location);
				log.info("applicationContext: [{}]", file.getAbsolutePath() );
		    	ctx = new FileSystemXmlApplicationContext(location);
		     }
		}catch(Exception e){
			log.error("InitCtx Error:", e);
			System.exit(1);
		}
	}
	
	public ApplicationContext getApplicationContext(){
		return this.ctx;
	}
	
	public void destroy()
	{
		if(ctx != null)
			((FileSystemXmlApplicationContext)ctx).destroy();
	}
	
	public Object  getService(String serviceName){
		return ctx.getBean(serviceName);
	}

	public <T> T  getBean(String beanId, Class<T> clazz){
		return ctx.getBean(beanId, clazz);
	}
	
	public <T> T  getBean(Class<T> clazz){
		return ctx.getBean(clazz);
	}
	
	public static void main(String[] args) {
		getInstance();
	}
	
}
