package com.sj.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: 19191
 * @date: 2019年8月8日 下午3:56:33
 */
public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//获取日历类
		Calendar c = Calendar.getInstance();
		//格式化日期
	
		c.setTime(src);
		//设置传入日期是月初
		c.set(Calendar.DAY_OF_MONTH,1);
		//设置小时
		c.set(Calendar.HOUR_OF_DAY,0);
		//设置分钟
		c.set(Calendar.MINUTE,0);
		//设置秒
		c.set(Calendar.SECOND,0);
		
		return c.getTime();
	
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//获取日期类 
		Calendar c = Calendar.getInstance();
		//初始化日期类
		c.setTime(src);
		//月份+1
		c.add(Calendar.MARCH, 1);
		Date date = getDateByInitMonth(c.getTime());
		c.setTime(date);
		//让一秒
		c.add(Calendar.SECOND, -1);
		
		
		
		return c.getTime();
	
	}
	/**
	 * 
	 * @Title: getAge 
	 * @Description: 根据日期获取年龄
	 * @param src
	 * @return
	 * @return: int
	 * @throws Exception 
	 */
	public static int getAge (Date src) throws Exception {
		Date d1 = new Date();
		
		
		
		
		
		long time = d1.getTime();
		long time2 = src.getTime();
		
		return (int) ((time-time2)/24.0*24.0);
		}
	/**
	 * 
	 * @Title: getDaysByFuture 
	 * @Description: 求未来日期离今天还剩的天数
	 * @param future
	 * @return
	 * @return: int
	 */
	public static int getDaysByFuture (Date future) {
		Date date = getDateByFullMonth(new Date());
		Date date2 = getDateByInitMonth(new Date());
		
		long time = date.getTime();
		long time2 = date2.getTime();
		
		return (int) ((time-time2)/(60*60*60*24.0));
		
		}
	/**
	 * 
	 * @Title: getDaysByDeparted 
	 * @Description: 求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 * @return: int
	 */
	public static int getDaysByDeparted (Date departed) {
		
		Date date = getDateByInitMonth(new Date());
		
		long time = date.getTime();
		long time2 = departed.getTime();
		
		
		
		return (int) ((time2-time)/(60*60*60*24.0));
		
		}
	

}
