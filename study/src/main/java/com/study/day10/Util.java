package com.study.day10;

import java.security.PublicKey;

// 共用的工具程式
public class Util {
	// 計算總分
	public static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	// 計算平均
	public static double getAvg(int[] array) {
		int sum = getSum(array);
		double avg = sum / (double) array.length;
		return avg;
	}

	// 最高分
	public static int getMax(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	// 最低分
	public static int getMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	//由小到大排序
	public static void sortASC(int[] array) {
		for(int count = 0;count<array.length-1;count++) {
			for(int i=0;i<array.length-1;i++) {
				int a= array[i];
				int b= array[i+1];
				if(b<a) {
					array[i]= b;
					array[i+1]= a;
					
				}
			}
		}
	}
	//由大到小排序
	public static void sortDESC(int[] array) {
		for(int count = 0;count<array.length-1;count++) {
			for(int i=0;i<array.length-1;i++) {
				int a= array[i];
				int b= array[i+1];
				if(b>a) {
					array[i]= b;
					array[i+1]= a;
					
				}
			}
		}
	}
}
