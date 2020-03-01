package com.preethi.di;

public class AnotherStudent {
	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating() {
		System.out.print("From anotherstudent class: ");
		cheat.mathCheat();
	}
}
