package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Airport;
import com.pojo.People;
import com.service.impl.AirportServiceImpl;

public class Test {
	public static void main(String[] args) {
//		People peo = new People();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("people",People.class);
		
		System.out.println(people.getList().size());
		System.out.println(people);
		
		/*String[] names = ac.getBeanDefinitionNames();
		for (String string : names) {
			System.out.println(string);
		}*/
		
		/**
		 * 实例工厂测试代码
		 * 
		 * 具体如何实例化工厂和本个知识点无关系.
		 * 
		 */
//		PeopleFactory factory = new PeopleFactory();
//		People people = factory.newInstance();
		
		/**
		 * 静态工厂
		 */
//		People peo = PeopleFactory.newInstance();
		
		AirportServiceImpl bean = ac.getBean("airportService",AirportServiceImpl.class);
		List<Airport> list = bean.show();
		System.out.println(list);
	}
}
