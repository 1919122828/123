package com.sj.common.utils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtil {
	/**
	 * 
	 * @Title: getgetRqFromUrl 
	 * @Description: 查找日期
	 * @param url
	 * @return
	 * @return: Date
	 */
	public static Date getgetRqFromUrl(String url) {
		
		//定义规则
		String pattern = "-(\\d+)-";
		//编译规则
		Pattern c = Pattern.compile(pattern);
		//匹配规则
		Matcher m = c.matcher(url);
		//查找到符合规则的结果
		if(m.find()) {
			return StringUtil.strToDate(m.group(1));
		}
		return null;
		
	}
	/**
	 * 
	 * @Title: getNumberFormUrl 
	 * @Description: 返回num
	 * @param url
	 * @return
	 * @return: Integer
	 */
	public static Integer getNumberFormUrl(String url) {
		//定义规则
		String pattern = "[0-9]+(?=[^0-9]*$)";
		//编译规则
		Pattern c = Pattern.compile(pattern);
		//规则匹配
		Matcher m = c.matcher(url);
		//查找到匹配规则的结果集
		if(m.find()) {
			String str = m.group();
			return StringUtil.strToInteger(str);
		}
		return null;
	}
	/**
	 * 
	 * @Title: strToNum 
	 * @Description: 是否是数值
	 * @param str
	 * @return
	 * @return: boolean
	 */
	
	public boolean strToNum(String str) {
		//定规则
		String pattern = "^[0-9]&";
		
		Pattern c = Pattern.compile(pattern);
		
		Matcher m = c.matcher(str);
		
		return m.find();
		
	}
	

}
