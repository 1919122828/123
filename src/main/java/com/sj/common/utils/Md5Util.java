package com.sj.common.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @ClassName: Md5Util 
 * @Description: TODO
 * @author: 1919
 * @date: 2019年5月12日 下午8:53:18
 */
public class Md5Util {
	/**
	 * 直接对密码进行散列，那么黑客可以对通过获得这个密码散列值，
	 * 然后通过查散列值字典（例如MD5密码破解网站），得到某用户的密码。
	 * 加Salt可以一定程度上解决这个问题
	 */
	//加盐值 :
	private static String salt="1a2b3c4d";
	
	public static String md5Encoding(String password) {
		return  DigestUtils.md5Hex(password +salt);
	}
	
	
	
	/*qwetao123
	 * public static void main(String[] args) { String s =
	 * Md5Util.md5Encoding("123456"); String s2 = Md5Util.md5Encoding("1");
	 * System.out.println(s); System.out.println(s2); }
	 */
	 

}
