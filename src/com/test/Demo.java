package com.test;

public class Demo {
	
	public void demo1() throws Exception{
		int i = 5/0;
		System.out.println("demo1");
	}
	
	public void demo1(String name,int age) throws Exception{
//		int i = 5/0;
		System.out.println("demo1"+name+"  "+age);
	}
	
	public void demo1(String name){
		System.out.println("一个参数demo1");
	}
	
	public void demo2(){
		System.out.println("demo2");
	}
	
	public void demo3(){
		System.out.println("demo3");
	}
	
	public void demo4(String name){
		System.out.println("demo4");
	}
	
	public String demo5(String name){
		System.out.println("demo5");
		return "Demo5的返回值";
	}
}
