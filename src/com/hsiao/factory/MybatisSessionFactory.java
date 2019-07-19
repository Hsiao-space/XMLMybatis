package com.hsiao.factory;

import java.io.InputStream;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MybatisSessionFactory {
	
	//创建日志追踪器
	private static Logger log=LogManager.getLogger();
	
	private static SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 加载mybatis-config.xml配置文件
	 */
	static {
		InputStream ins= MybatisSessionFactory.class.getClass().getResourceAsStream("/mybatis-config.xml");
	 	sqlSessionFactory=new SqlSessionFactoryBuilder().build(ins);
	}
	
	public static SqlSession getSession() {
		if(sqlSessionFactory==null) {
			throw new NullPointerException("session 工厂创建失败！");
		}
		//设置BATCH 批处理模式  fasle代表是事务非自动提交 
		SqlSession session=sqlSessionFactory.openSession(ExecutorType.BATCH,false);
		return session;
	}
	
	public static void main(String...args) {
		SqlSession session=MybatisSessionFactory.getSession();
		log.debug("获取Connection对象"+session.getConnection());
	}
}
