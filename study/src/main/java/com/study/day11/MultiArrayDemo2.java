package com.study.day11;

import java.util.Arrays;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		//二維陣列的初始值
		int [][]m = {{100, 90, 80},{95, 85, 75}};
		Util.print2(m);
		//m 班級有Ａ、Ｂ兩位學生
		//Ａ的考試成績{100, 90, 80}
		//Ｂ的考試成績{95, 85, 75}
		//請問Ａ與Ｂ的平均各是多少？班平均是多少？
		double a_avg = com.study.day10.Util.getAvg(m[0]);
		double b_avg = com.study.day10.Util.getAvg(m[1]);
		System.out.printf("%.1f %.1f %.1f",
				a_avg, b_avg, (a_avg+b_avg)/m.length);
		//Sol2:
		//將所有人的平均放到一維陣列中
		double [] avgs = new double[m.length];
		for(int i =0; i<avgs.length; i++) {
			double avg = com.study.day10.Util.getAvg(m[i]);
			avgs [i] = avg;
			
		}
		System.out.println("  avgs= "+Arrays.toString(avgs));
		double avg = com.study.day10.Util.getAvg(avgs);
		System.out.println(avg);
		
		
	}

}
