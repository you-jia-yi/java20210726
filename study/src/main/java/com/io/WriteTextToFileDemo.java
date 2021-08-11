package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFileDemo {

	public static void main(String[] args) {
		//將文字資料寫入檔案
		String data1 = "Happy Birthday";
		String data2 = "新年快樂";
		
		FileWriter fw = null;
		try {
			//true 保留原檔案的內容,false(預設）清除原檔案內容
			//fw = new FileWriter("src/main/java/com/io/data/hello.txt", true);
			//fw = new FileWriter("src/main/java/com/io/data/hello.txt", false);
			fw = new FileWriter("src/main/java/com/io/data/hello.txt");
			fw.write(data1);
			fw.write("\r\n");
			fw.write(data2);
			System.out.println("寫入成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}		
	}
}
