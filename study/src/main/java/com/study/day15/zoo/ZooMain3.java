package com.study.day15.zoo;


public class ZooMain3 {
	//多型下轉型的問題II
	public static void main(String[] args) {
		Animal a1 = (Animal)new Bird();//OK
		//System.out.println(a1.getLegs());
		//a1.move();
		Bird b2 =(Bird)new Ostrich();//OK
		Ostrich o3 =(Ostrich)b2;//OK
		o3.move();
		Ostrich o4 =(Ostrich)a1;//Error
		Bird b5 = (Bird)new Animal();//Error
	/*
	    C1= Animal, C2= Bird, C3 = Ostrich
		16. C1 obj1 = (C1) new C2();    父 = 子 => OK
		17. C2 obj2 = (C2) new C3();	父 = 子 => OK
		18. C2 obj3 = (C2) new C1();  想成Bird obj3 = new Animal(); => Error
		19. C3 obj4 = (C3) obj2;	  想成Ostrich = new Ostrich(); =>OK
		Which line throws ClassCastException?
		Ans: line 18
	*/
		
	}

}
