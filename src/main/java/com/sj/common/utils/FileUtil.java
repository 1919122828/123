package com.sj.common.utils;

import java.io.File;

public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		//如果文件名字不是null 并且 文件长度不是0 并且 文件名称截取后大于0说明文件名正确
		if(null != fileName && fileName.length()>0 && fileName.lastIndexOf(".")>0)
		return fileName.substring(fileName.lastIndexOf("."));
		return "文件不合法";
	//TODO 实现代码
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		//System.getProperty(key) key里面固定的写入
		String str = System.getProperty("java.io.tmpdir");
		//返回的路径 用file接
		return new File(str);
	//TODO 实现代码
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		
		String str = System.getProperty("user.home");
		
		return new File(str);
	//TODO 实现代码
	}

}
