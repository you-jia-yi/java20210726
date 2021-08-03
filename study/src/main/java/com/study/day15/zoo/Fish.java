package com.study.day15.zoo;

public class Fish extends Animal {
	Fish() {
		System.out.println("Fish物件被建立");
		setLegs(0);
	}

	@Override
	void move() {
		System.out.println("我會游泳");
		
	}
	
}
