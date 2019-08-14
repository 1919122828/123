package com.sj.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PatternUtilTest {

	@Test
	public void testGetgetRqFromUrl() {
		String str = "http://news.cnstock.com/news,yw-201908-4413224.htm";
		Date getgetRqFromUrl = PatternUtil.getgetRqFromUrl(str);
		System.out.println(getgetRqFromUrl);
	}

	@Test
	public void testGetNumberFormUrl() {
		String str = "http://news.cnstock.com/news,yw-201908-4413224.htm";
		Integer numberFormUrl = PatternUtil.getNumberFormUrl(str);
		System.out.println(numberFormUrl);
	}

	@Test
	public void testStrToNum() {
		
	}

}
