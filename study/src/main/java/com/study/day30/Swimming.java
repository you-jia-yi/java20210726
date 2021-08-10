package com.study.day30;


//奧運1000m游泳
//執行緒工作（Runnable）
public class Swimming implements Runnable {

	@Override
	public void run() {
		//要游1～1000
				String tName = Thread.currentThread().getName();
				for(int i=1;i<=1000;i++) {
					System.out.printf("%s 游了 %d公尺\n", tName, i);
			}
	}
	
	

}
