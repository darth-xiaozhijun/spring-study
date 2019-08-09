package com.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrow implements ThrowsAdvice{

	public void afterThrowing(Method m, Object[] args,Object target, Exception ex) {
		
		// System.out.println("执行异常通知");
	}
	
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("执行异常通过-schema-base 方式");
	}
}
