package org.crazyit.app.service.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.crazyit.app.service.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Chinese implements Person , InitializingBean
	, BeanNameAware, ApplicationContextAware
{
	private Axe axe;
	public void setBeanName(String beanName)
	{
		System.out.println("===setBeanName===");
	}
	public void setApplicationContext(ApplicationContext ctx)
	{
		System.out.println("===setApplicationContext===");
	}
	public Chinese()
	{
		System.out.println("Spring实例化主调bean：Chinese实例...");
	}
	// axe的setter方法
	public void setAxe(Axe axe)
	{
		System.out.println("Spring调用setAxe()执行依赖注入...");
		this.axe = axe;
	}
	public void useAxe()
	{
		System.out.println(axe.chop());
	}
	// 测试用的初始化方法
	public void init()
	{
		System.out.println("正在执行初始化方法 init...");
	}
	// 实现InitializingBean接口必须实现的方法
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("正在执行初始化方法 afterPropertiesSet...");
	}
}