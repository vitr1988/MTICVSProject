package ru.mti.edu;

import java.util.List;

public class Car implements Moveable {

	double power;
	String mark;
	List<Part> partList;
	
	private Engine engine;
	
	public void setEngine(Engine engine){
		this.engine = engine;
	}
	
//	public int calculateMoment(Engine engine){
//		return engine.getMomment();
//	}
	
	@Override
	public void move(){
		
	}
}
