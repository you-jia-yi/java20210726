package com.study.day10;


public class ArrayDemo {

	public static void main(String[] args) {
		int[] scores = {100, 80, 0, 90};
		//將0分改成70分
		scores[2]= 70;
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		//scores 陣列長度
		System.out.println(scores.length);
		//利用for-loop取得陣列元素內容
		int sum = 0;
		for(int i = 0;i<scores.length;i++ ) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		//請問總分與平均各是多少
		System.out.println(sum);
		System.out.println(sum/scores.length);
	}
}
