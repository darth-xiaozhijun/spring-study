package com.pojo;

public class PeopleFactory {
	
	public static People newInstanceStatic(){
		return new People(1,"静态工厂");
	}
	
	public People newInstance(){
		return new People(1,"实例工厂");
	}
}
