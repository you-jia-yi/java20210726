package com.study.day05;

public class HelloBMI {

	public static void main(String[] args) {
		BMI b1 = new BMI("John", 170, 60);
<<<<<<< HEAD
		// 查看目前的屬性資料
//		System.out.println(b1.getName());
//		System.out.println(b1.getHeight());
//		System.out.println(b1.getWeight());
//		System.out.println(b1.getBmi());
=======
		//查看目前屬性資料
		System.out.println(b1.getName());
		System.out.println(b1.getHeight());
		System.out.println(b1.getWeight());
		System.out.println(b1.getBmi());
		
>>>>>>> branch 'master' of https://github.com/you-jia-yi/java20210726.git
		System.out.println(b1);
		
		// 變更身高
		b1.setHeight(180);
		// 查看目前的屬性資料
		System.out.println(b1);
		
	}

}