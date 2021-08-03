package com.study.day15.zoo;

public class Ostrich extends Bird {
	public Ostrich() {
		System.out.println("Ostrich物件被建立");
	}

	@Override
	void move() {
	  System.out.println("我不會飛");
		
	}
	
}
