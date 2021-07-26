package com.study.day02;

// 設計一個 BMI 類別物件
// 需求：存放人名 身高 體重 <---屬性
//     計算BMI 值        <---方法
public class BMI {
	String name;
	double height;
	double weight;
	
	//取得 bmi 的計算結果（計算結果也就是回傳值是 double)
	double getBmiValue() {
		//實作 bmi 的計算公式
		double bmi = weight / Math.pow(height/100, 2);
		//回傳(return)bmi的結果
		return bmi;
	}
}
