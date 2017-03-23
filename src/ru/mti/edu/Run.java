package ru.mti.edu;

public class Run {

	public static void main(String[] args) {
		Car car = new Car();
		car.mark = "Skoda";
		car.power = 150;
		Engine engine = new Engine();
		engine.atmospherType = false;
		engine.volume = 150; //hp
		
		car.setEngine(engine);
	}

}
