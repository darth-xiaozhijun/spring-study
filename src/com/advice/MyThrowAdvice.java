package com.advice;

public class MyThrowAdvice {

	public void myexception(Exception e){
		
		System.out.println("执行异常通知"+e.getMessage());
	}
}
