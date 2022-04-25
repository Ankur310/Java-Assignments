package com.question3;

public class Rectangle {
	
	int length;
	
	int  width;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}



	public  int area() {
		
	  return this.length * this.width;
	}

}
