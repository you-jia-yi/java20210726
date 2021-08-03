package com.study.day15.zoo;

public class ZooMain {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		printAnimal(tiger);
		
		Fish fish = new Fish();
		printAnimal(fish);
		
	    Bird bird = new Bird();
		printAnimal(bird);
		
		Ostrich ostrich = new Ostrich();
		printAnimal(ostrich);
	}
	public static void printAnimal(Animal animal) {
		System.out.printf("%s 有 %d 條腿\n", 
				animal.getClass().getSimpleName(), 
				animal.getLegs());
		animal.move();
		//如果animal 所指向的物件是Bird 或Ostrich時
		//請呼叫特有方法 birth()
	if(animal instanceof Bird) {
		((Bird) animal).birth();
	  }
	
	}
	
}
