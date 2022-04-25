package com.question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Circle circle = (Circle) context.getBean("circle");
	    System.out.println(circle.area());
	    
	    
	    Rectangle  rect = (Rectangle) context.getBean("rectangle");
	    System.out.println(rect.area());
	    
	    Square square = (Square) context.getBean("square");
	    System.out.println(square.area());
	    
	    
	    Traingle trai = (Traingle) context.getBean("triangle");
	    System.out.println(trai.area());
	}

}
