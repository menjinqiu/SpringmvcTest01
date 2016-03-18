package com.atguigu.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.entities.User;

@Controller
public class Test01 {

	@RequestMapping(value="/testParams",method=RequestMethod.GET,params={"age","tell"})
	public String params(int age , Integer tell){
		
		System.out.println("=====params");
		System.out.println("age="+age+",tell="+tell);
		return "ok";
	}
	
	@RequestMapping(value="testParams2",method=RequestMethod.GET,params={"age","tell"})
	public String params2(){
		System.out.println("======params2");
		return "ok";
	}
	
	@RequestMapping(value="/testHeaders",method=RequestMethod.GET,headers={"Host=localhost:8080"})
	public String testHeaders(){
		System.out.println("=====Headers");
		return "ok";
	}
	
	@RequestMapping(value="/testAnt*",method=RequestMethod.GET)//经过试验得知,value值中 符号"/"加不加貌似并不影响结果.为什么?
	public String testAnt(){
		System.out.println("=======Ant");
		return "ok";
	}
	
	@RequestMapping(value="/testPathVariable/{musicId}",method=RequestMethod.GET)
	public String testPathVariable(@PathVariable("musicId") String musicId){
		System.out.println("=======PathVariable");
		System.out.println(musicId);
		return "ok";
	}
	
//	增
	@RequestMapping(value="/order",method=RequestMethod.POST)
	public String testPost(){
		System.out.println("====post");
		return "ok";
	}
	
//	删
	@RequestMapping(value="/order/{uuid}",method=RequestMethod.DELETE)
	public String testDelet(@PathVariable("uuid") String uuid){
		System.out.println("======delet");
		System.out.println("uuid="+uuid);
		return "ok";
	}
	
	//PUT是改,POST是增,GET是查
	@RequestMapping(value="/order/{uuid}",method=RequestMethod.PUT)
	public String testPut(){
		System.out.println("=======PUT");
		return "ok";
	}
	
//	查
	@RequestMapping(value="/order/{uuid}",method=RequestMethod.GET)
	public String testGet(@PathVariable("uuid") String uuid){
//		System.out.println("num="+num+"uuid="+uuid);
//		,@PathVariable("num") String num 
		System.out.println("uuid="+uuid);
		System.out.println("========GET");
		return "ok";
	}
	
//	参数传递
	@RequestMapping(value="/testParams",method=RequestMethod.GET)
	public String testParams(@RequestParam("age") Integer age,@RequestParam("email") String email,
			@RequestParam(value="passWorld",required=false,defaultValue="123456") String passWorld){
		System.out.println("age="+age+"email="+email+"passWorld="+passWorld);
		return "ok";
	}
	
//	cookie 传递
//	id 的参数类型必须是String 不然报Request请求语法错误.连方法都进不了.
	@RequestMapping(value="/testCookieValue",method=RequestMethod.GET)
	public String testCookieValue(@CookieValue("JSESSIONID") String id){
		System.out.println("id="+id);
		System.out.println("=====cookie");
		return "ok";
	}
	
	
//	Pojo类的传递
	@RequestMapping(value="/testPojo",method=RequestMethod.POST)
	public String testPojo(User user){
		System.out.println(user);
		System.out.println(user.getAge());
		System.out.println(user.getUserName());
		System.out.println(user.getPassWorld());
		System.out.println(user.getId());
		System.out.println(user.getEmail());
		System.out.println(user.toString());
		return "ok";
	}
	
	
//	ModelAndView
	@RequestMapping(value="/testModelAndView" ,method=RequestMethod.GET)
	public ModelAndView testModelAndView(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("hahahha", "sdfadsfasdfss");
		mv.setViewName("ok");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="testMAV" ,method=RequestMethod.GET)
	public ModelAndView testMAV(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("ha", "hahahahhahahahahhhahiahaihai");
		mv.setViewName("ok");
		return mv;
	}
	
	
	
	
	
}
