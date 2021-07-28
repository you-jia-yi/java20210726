package com.study.day10;

import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] scores = {100, 80, 70, 90};
		//利用Util 求出總分與平均各是多少
		int sum = Util.getSum(scores);
		double avg = Util.getAvg(scores);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(Arrays.toString(scores));
	}
}
