package com.study.day04;

public class BMI {
	String name;
	private double height;//private 
	private double weight;//
	BMI(){//
		
	}
	
	BMI(String name, double height, double weight) {
		this.name = name; //this. -->唸成“物件的”
		this.weight = weight;
		this.height = height;
	}
	
	//setter 的方法
	void setHeight(double height) {
		//驗證height 是否 > 0
		if(height > 0) {
			this.height = height;
		}
	}
	
	void setWeight(double weight) {
		//驗證weight 是否 > 0
		if(height > 0) {
			this.weight = weight;
		}
	}
	double getBmiValue() {
		double bmi = weight/Math.pow(height/100, 2);
		return bmi;
	}
}
