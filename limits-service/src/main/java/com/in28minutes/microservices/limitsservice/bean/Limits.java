package com.in28minutes.microservices.limitsservice.bean;

public class Limits {
	
	private int maximum;
	private int minimum;
	
	public Limits() {}

	public Limits(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	

}
