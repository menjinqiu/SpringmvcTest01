package com.atguigu.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  * 1 建web工程 + jar
 * 
 * 2 进行web.xml的配置，主要进行DIspatchServle的配置
 * 		2.1 一种是在src目录下有springmvc的配置文件
 *		2.2 WEB-INF下面进行springmvc的配置文件的配置
 *
 * 3 springDispatcherServlet-servlet.xml文件进行包路径扫描+通用师徒解析器的配置
 * 
 * 4 新建了index.jsp进行请求的提交和发送
 * 
 * 5 新建了HelloWorld处理类Handler
 * 
 * 		5.1 @Controller
 * 		5.2 @RequestMapping
 * 
 * 6 结果页面送给IE前台渲染显示，ok.jsp
 * 
 * @author menjinqiu
 *
 */
@Controller
public class HelloWorldHandler {
//	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
//	public String hellodworld(){
//		System.out.println("======hello");
//		return"ok";
//	}
	
	@RequestMapping(value="/hello234" , method=RequestMethod.GET)   //跟的是请求页面的value值？！
	public String helloworld(){
		System.out.println("一转眼，又不见！~");
		return "ok";						//直接指向访问页面
	}
	
//	@RequestMapping(value="/testParams",method=RequestMethod.GET)
//	public String params(){
//		
//		return "ok";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
