package com.sj.common.utils;

import java.util.Calendar;
import java.util.Date;

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

}
