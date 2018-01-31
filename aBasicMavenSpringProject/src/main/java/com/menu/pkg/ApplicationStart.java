package com.menu.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ApplicationStart {

	public static void main(String[] args) { //program starts here also an IOC container (entire class)
		//other way to do this is a bean factory, which is faster but less ideal use
		 ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml"); //this is your servlet
		 Point p = (Point)applicationContext.getBean("Point10"); // this links to beanID in XML file
		 System.out.println(p.getX());
		 System.out.println(p.getY());
		 ((ClassPathXmlApplicationContext) applicationContext).close();
		// TODO Auto-generated method stub

	}

}
