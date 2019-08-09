package com.sj.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	public static int random(int min,int max) {
		
		Random r = new Random();
		
		int i = r.nextInt(max - min + 1) +min;
		
		return i;
	}
	// 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter() {
		//穷举1-9,a-Z的字符
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//charrAt(index).根据下标返回字符串的值
		
		return str.charAt(random(0,str.length()-1));
	}
	
	public static int[] subRandom(int min,int max,int subs) {
		//定义一个数组,长度由subs
		int [] a = new int[subs];
		
		//定义一个set集合
		HashSet<Integer> set = new HashSet<Integer>();
		//循环获取随机数
		while(set.size()<subs) {
			set.add(random(min,max));
		}
		
		System.out.println(set);
		return a;
	}
	
	public static String randomString(int length) {
		return null;
	}

	
	

}
