package com.hsiao.factory;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * Mybatis框架中配置C3P0数据库连接池，继承Mybatis框架中UnpooledDataSourceFactory
 * 写一个构造函数 将C3P0中ComboPooledDataSource 赋给datasource,是Mybatis中的数据源变量
 * 将C3P0DataSource(自定义类名)C3P0连接池功能类放到mybatis-config.xml(自定义mybatis配置名)中
 * <dataSource type="com.hsiao.factory.C3P0DataSource" /> type属性中赋予类名全称
 * @author Administrator
 *
 */
public class C3P0DataSource extends UnpooledDataSourceFactory{
	
	public C3P0DataSource() {
		
		this.dataSource = new ComboPooledDataSource();  //dataSource来自父类
	}
}
