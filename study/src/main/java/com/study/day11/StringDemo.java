package com.study.day11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = new String("javA");
		System.out.println(s1 == s2 );
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));//不分大小寫
		System.out.println();
		String s4 = "Java";
		String s5 = "Java";
		System.out.println(s4 == s5 );
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s3));//不分大小寫
		System.out.println();
		char [] chars = {'J', 'a', 'v', 'a'};
		String s6 = new String(chars);
		System.out.println(s4 == s6 );
		System.out.println(s4.equals(s6));
		
		
	}

}
