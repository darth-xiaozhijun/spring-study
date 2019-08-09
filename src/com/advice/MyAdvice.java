package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	
	@Before("com.test.Demo.demo1()")
	public void mybefore(){
		System.out.println("前置");
	}
	
	public void mybefore(String name1,int age1){
		System.out.println("前置"+name1 );
	}
	
	public void mybefore1(String name1){
		System.out.println("前置:"+name1);
	}
	
	public void myaftering(){
		System.out.println("后置2");
	}
	
	@After("com.test.Demo.demo1()")
	public void myafter(){
		System.out.println("后置1");
	}
	
	@AfterThrowing("com.test.Demo.demo1()")
	public void mythrow(){
		System.out.println("异常");
	}
	
	@Around("com.test.Demo.demo1()")
	public Object myarround(ProceedingJoinPoint p) throws Throwable{
		System.out.println("执行环绕");
		System.out.println("环绕-前置");
		Object result = p.proceed();
		System.out.println("环绕-后置");
		return result;
	}
}
