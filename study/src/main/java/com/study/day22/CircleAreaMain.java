package com.study.day22;

public class CircleAreaMain {

	public static void main(String[] args) {
		//若半徑 = 10,求面積=?
		CircleArea circleArea = new CircleArea() {
			
			@Override
			public double calc(double r, int type) {
				
			    double result = 0;
				switch (type) {
				case CircleArea.AREA:
					result = Math.pow(r, 2)*Math.PI;
					break;
				case CircleArea.VOLUMN:
					result = 4/3*Math.pow(r, 3)*Math.PI;
					break;
					
				}
				return result;
			}
		};
		System.out.println(circleArea.calc(10,CircleArea.AREA));
		System.out.println(circleArea.calc(10,1));
		System.out.println(circleArea.calc(10,CircleArea.VOLUMN));
		System.out.println(circleArea.calc(10,2));
		
	}
}
