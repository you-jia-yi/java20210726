package com.study.day30;

public class Olympics {

	public static void main(String[] args) {
		//比賽項目
		Swimming swimming= new Swimming();
		Running running = new Running();
		Cycling cycling = new Cycling();
		
		//選手（Thread）
		Thread john =new Thread(swimming, "約翰");
		Thread mary = new Thread(running, "瑪麗");
		//比賽開始
		john.start();
		mary.start();
		
	}

}
