package com.sj.common.utils;

import static org.junit.Assert.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date2 = DateUtil.getDateByInitMonth(new Date());
		
		System.out.println(df.format(date2));
		
		
		
		
	}

	@Test
	public void testGetDateByFullMonth() {
		
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = DateUtil.getDateByFullMonth(new Date());
		
		System.out.println(df.format(date));
		
	}
	
	@Test
	public void test() {
		
		//调用月初方法
		Date initMonth = DateUtil.getDateByInitMonth(new Date());
		//调用月末方法
		Date fullMonth = DateUtil.getDateByFullMonth(new Date());
		//格式化时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String str = "select * from t_order where create_time>='{1}' and create_time<='{2}'";
		//使用replace进行拼接添加
		String str2 = str.replace("{1}",format.format(initMonth)).replace("{2}", format.format(fullMonth));
		
		System.out.println(str2);
	}
	@Test
	public void testgetAge() throws Exception {
		int i = DateUtil.getAge(new Date());
		
		System.out.println(i);
	}
	@Test
	public void getDaysByDeparted() throws Exception {
		int i = DateUtil.getDaysByDeparted(new Date());
		
		System.out.println(i);
	}
	
	@Test
	public void getDaysByFuture() throws Exception {
		int i = DateUtil.getDaysByFuture(new Date());
		
		System.out.println(i);
	}
	

}
