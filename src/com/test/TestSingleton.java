package com.test;

import com.singleton.Singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton==singleton1);
	}
}
