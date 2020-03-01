package com.preethi.di;

public class Student {
	private int id;
	private MathCheat mathcheat ;// default value null
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating() {
		mathcheat.mathCheat();
		System.out.println("my id is "+ id);
	}

}
