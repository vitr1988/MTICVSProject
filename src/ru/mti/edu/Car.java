package ru.mti.edu;

import java.util.List;

public class Car implements Moveable {

	private String mark;
	List<Part> partList;
	
	private PowerData data = new PowerData();

	public Engine setEngine(Engine engine){
		this.data.engine = engine;
		return this.data.engine;
	}
	
	public int calculateMoment(Engine engine){
		log("Test1");
		log("Test2");
//		return engine.getMomment();
		return -1;
		
	}

	private void log(String message) {
		System.out.println(message);
		int i = 0;
	}
	
	@Override
	public void move(){
		
	}

	public double getPower() {
		return data.power;
	}

	public void setPower(double power) {
		this.data.power = power;
	}

	String getMark() {
		return mark;
	}

	void setMark(String mark) {
		this.mark = mark;
	}	
}
