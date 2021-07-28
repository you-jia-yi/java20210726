package com.study.day10;

import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		int[] scores = {90, 80, 100, 70};
		//由小到大排序
		/*
		 
		 90, 80, 100, 70
		 80, 90, 100, 70
		 80, 90, 100, 70
		 80, 90, 70, 100
		 二、
		 80, 90, 70, 100
		 80, 90, 70, 100
		 80, 70, 90, 100
		 80, 70, 90, 100
		 三、
		 80, 70, 90, 100
		 70, 80, 90, 100
		 70, 80, 90, 100
		 70, 80, 90, 100
		 */
		System.out.println(Arrays.toString(scores));
		Util.sortASC(scores);
		System.out.println(Arrays.toString(scores));
		Util.sortDESC(scores);
		}
	}

