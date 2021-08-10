package com.study.day29;

public class ThreadTest2 {

	public static void main(String[] args) {
		//龜兔賽跑(各自跑1000步)
		Race turtle = new Race();
		Race rabbit = new Race();
		turtle.setName("烏龜");//設定執行緒的名字
		rabbit.setName("兔子");
		//如何在多數的情況下讓烏龜能贏得比賽？
		turtle.setPriority(Thread.MAX_PRIORITY);
		rabbit.setPriority(Thread.MIN_PRIORITY);
		turtle.start();//執行緒啟動
		rabbit.start();
		
	}
	
}
