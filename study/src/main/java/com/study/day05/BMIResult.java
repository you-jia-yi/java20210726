package com.study.day05;

public class BMIResult {
	private String result;
	private BMI bmi;

	public BMIResult(BMI bmi) {
		super();
		this.bmi = bmi;
		//分析
		double bmiValue = this.bmi.getBmi();
		if(bmiValue>23) {
			result = "過胖";
		}else if (bmiValue<=18) {
			result = "過輕";
		}else {
			result = "剛剛好";
		}
	}

	public String getResult() {
		return result;
	}

	
	
	
}
