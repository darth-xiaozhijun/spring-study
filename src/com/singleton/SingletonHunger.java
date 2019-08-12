package com.singleton;

public class SingletonHunger {
	//由于对象需要被静态方法调用,把方法设置为static
	//由于对象是static,必须要设置访问权限修饰符为private ,如果是public可以直接调用对象,不执行访问入口
	private static SingletonHunger singleton;
	/**
	 * 方法名和类名相同
	 * 无返回值.
	 * 
	 * 
	 * 其他类不能实例化这个类对象
	 * 
	 * 对外提供访问入口
	 */
	private SingletonHunger(){}
	
	/**
	 * 实例方法,实例方法必须通过对象调用
	 * 
	 * 设置方法为静态方法
	 * 
	 * 
	 * @return
	 */
	public static SingletonHunger getInstance(){
		//添加逻辑如果实例化过,直接返回
		if(singleton==null){
			/*
			 * 多线程访问下,可能出现if同时成立的情况,添加锁
			 */
			synchronized (SingletonHunger.class) {
				//双重验证
				if(singleton==null){
					singleton = new SingletonHunger();
				}
			}
			
		}
		return singleton;
	}
}
