package com.preethi.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*Student student = new Student();
		MathCheat cheat = new MathCheat();
		
		student.setMathcheat(cheat);
		student.cheating();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student= context.getBean("stu", Student.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anothetStudent", AnotherStudent.class);
		anotherStudent.startCheating();
		
	}
}
