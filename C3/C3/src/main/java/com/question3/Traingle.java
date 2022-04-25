package com.question3;

public class Traingle {
    int base;
    int height;
	public Traingle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Traingle() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public double area() {
    	return 0.5*this.base*this.height;
    }
    
}
