package com.study.day14;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class GenericTypeDemo1 {
	public static void main(String[] args) {
		//無泛型
		LinkedHashSet scores = new LinkedHashSet();
		scores.add("國文");
		scores.add(100);
		scores.add("數學");
		scores.add(90);
		
		Iterator iter = scores.iterator();
		int sum = 0;
		while (iter.hasNext()) {
			Object next  = iter.next();
			if(next instanceof Integer ) {
				System.out.println(next);
				sum +=(Integer)next;
			}	
		}
		System.out.println(sum);
		//有泛型
		LinkedHashSet<Integer>scores2 = new LinkedHashSet<>();
		scores2.add(100);
		scores2.add(90);
		Iterator<Integer>iter2 = scores2.iterator();
		int sum2 = 0;
		while (iter2.hasNext()) {
			//Integer next = iter2.next();
			sum2+=iter2.next();
			}
		System.out.println(sum2);
		//有泛型＋java8
		//取得總分
		int sum3 = scores2.stream()//Integer串流
					.mapToInt(score->score)
					.sum();
		System.out.println(sum3);
	}
}
