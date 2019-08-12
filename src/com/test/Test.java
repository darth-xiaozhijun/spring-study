package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Airport;
import com.pojo.People;
import com.pojo.PeopleDI;
import com.service.impl.AirportServiceImpl;

public class Test {
	public static void main(String[] args) {
//		People peo = new People();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		People people = ac.getBean("people",People.class);
//		
//		System.out.println(people.getList().size());
//		System.out.println(people);
		
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
		
//		AirportServiceImpl bean = ac.getBean("airportService",AirportServiceImpl.class);
//		List<Airport> list = bean.show();
//		System.out.println(list);
		
		/*Demo demo = ac.getBean("demo",Demo.class);
		try {
			demo.demo1();
//			demo.demo1("张三",12);
//			demo.demo1("李四");
		} catch (Exception e) {
//			e.printStackTrace();
		}*/
//		demo.demo2();
//		demo.demo3();
//		demo.demo4("传递的参数");
//		demo.demo5("切点返回值");
//		Demo1 demo1 = ac.getBean("demo1",Demo1.class);
//		demo1.demo11();
		/*try {
			demo.demo1("张三",12);
			demo.demo1("李四");
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}*/
		
		PeopleDI peopleDI = ac.getBean("peopledi", PeopleDI.class);
		System.out.println(peopleDI);
	}
}
