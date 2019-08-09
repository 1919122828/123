package com.sj.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;

public class MyH {
	static	BufferedInputStream bis = null;
	static	BufferedOutputStream bos = null;
	
	public static void main(String[] args) throws Exception {
		
		  bis = new BufferedInputStream(new FileInputStream("J:\\git\\m2.mp4"));
		  bos = new BufferedOutputStream(new FileOutputStream("J:\\git\\m4.txt"));
		
		 byte b [] = new byte [1024];
		 
		 while(bis.read(b, 0, b.length)!=-1) {
			 
			 bos.write(b, 0, b.length);
			 bos.flush();
		 }
		 System.out.println("完成100%");
		
		
	}

}
