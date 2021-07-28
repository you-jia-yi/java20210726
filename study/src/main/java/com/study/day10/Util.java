package com.study.day10;
//
public class Util {
	public static int getSum(int[] array) {
		int sum = 0;
		for(int i = 0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum;
	}
	//計算平均
	public static double getAvg(int[] array) {
		int sum = getSum(array);
		double avg = sum / (double)array.length;
		return avg;
	}
}
