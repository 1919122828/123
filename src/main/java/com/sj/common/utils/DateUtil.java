package com.sj.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateUtil {
	
	
	/**
	 * 字符串转成日期格式
	 * @Title: strToDate 
	 * @Description: TODO
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date strToDate(String src,String pattern) {
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date date =null;
		try {
			 date = df.parse(src);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return date;
		
	}
	
	
	
	/**
	 * 
	 * @Title: getRandomDate 
	 * @Description://返回 17-70 岁之间 随机日期
	 * @param minAge
	 * @param maxAge
	 * @return
	 * @return: Date
	 */
	public static Date getRandomDate(int minAge,int maxAge) {
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, - minAge);
		//结束
		Date endDate = c.getTime();
		
	
		//开始
		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.YEAR, - maxAge);
		Date startDate = c2.getTime();
		
		return getRandomDate(startDate, endDate);
		
		
		
	}
	/**
	 * 返回在某个范围之间的日期
	 * @Title: getRandomDate 
	 * @Description: TODO
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date getRandomDate(Date startDate,Date endDate) {
		//开始日期的毫秒数
		long l = startDate.getTime();
		//结束日期的毫米数
		long l2 = endDate.getTime();
		
		Random r = new Random();
		long x = (long) (Math.random() * (l2 - l + 1) + l);
		
		return new Date(x);
		
		
	}

	
	
	//示例:方法5：求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed) {
		
		//未来日期的毫秒数
				long last = departed.getTime();
				//当前日期的毫秒数
				long now = new Date().getTime();
				
				if(now < last)
					throw new RuntimeException("传入的日期不是为过去日期");
				//向上取整
				  return  (int) (Math.ceil((now -last ) /1000 /24/60/60.0)) ;
	}
	
	
	//示例:方法4：求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		//未来日期的毫秒数
		long end = future.getTime();
		//当前日期的毫秒数
		long now = new Date().getTime();
		
		if(now > end)
			throw new RuntimeException("传入的日期不是为未来日期");
		//向上取整
		  return  (int) (Math.ceil((end - now ) /1000 /24/60/60.0)) ;
		
	}
	
	//示例:	方法1：根据传入的日期获取年龄
	public static int getAge (Date src) {
	       //获取当前系统的日历类
		Calendar c1 = Calendar.getInstance();
		//获取当前的年月日
		int yearNow = c1.get(Calendar.YEAR);
		int monthNow = c1.get(Calendar.MONTH);
		int dayNow = c1.get(Calendar.DAY_OF_MONTH);
		
//		使用生日初始化日历类
		Calendar c2 = Calendar.getInstance();
	   c2.setTime(src);
		//获取生日的年月日
		int yearBirth = c2.get(Calendar.YEAR);
		int monthBirth  = c2.get(Calendar.MONTH);
		int dayBirth  = c2.get(Calendar.DAY_OF_MONTH);
		
		
		int age = yearNow - yearBirth;
		//2010-08 -15     
		//出生月大于当前月,则说明没过生日
		  if(monthBirth >  monthNow)
			  age --;//让年龄-1
		  
		  //月份一致,并且日期大于当前日期,则说明没过生日
		 if(monthBirth==monthNow && dayBirth > dayNow)
			 age--;//让年龄-1
		
	      return age;
			
		}
		
	
	//示例:	方法1：根据传入的日期获取年龄
	/*
	 * public static int getAge (Date src) { //获取当前系统的时间的毫米数 long now = new
	 * Date().getTime(); //生日的毫秒数 long birthday = src.getTime(); //年龄 int age =
	 * (int)((now - birthday)/1000/60/60/24/365) ; return age;
	 * 
	 * }
	 */
	
	
	
	/**
	 * 返回指定日期的字符串
	 * @Title: getDateForRegex 
	 * @Description: TODO
	 * @param date
	 * @param regex  yyyy-MM-dd HH:mm:ss  或 yyyy-MM-dd 
	 * @return
	 * @return: String
	 */
	 public static String getDateForRegex(Date date,String regex) {
		 SimpleDateFormat df = new SimpleDateFormat(regex);
		 return  df.format(date);
		 
	 }
	
	
	
	/*
	 * 方法1：(5分) 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 */
	public static Date getDateByInitMonth(Date src) {
		// 获取日历类
		Calendar c = Calendar.getInstance();
		// 根据传入的参数 初始化日历类
		c.setTime(src);
		// 设置传入日期的月初
		c.set(Calendar.DAY_OF_MONTH, 1);
		// 设置小时为0小时
		c.set(Calendar.HOUR_OF_DAY, 0);
		// 设置分钟为0分钟
		c.set(Calendar.MINUTE, 0);
		// 设置妙为0秒
		c.set(Calendar.SECOND, 0);

		return c.getTime();
	}

	/*
	 * 方法2：(5分) 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	 * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 */
	public static Date getDateByFullMonth(Date src) {
		// 获取日历类
		Calendar c = Calendar.getInstance();
		// 根据传入的参数 初始化日历类
		c.setTime(src);
// 让传入的月份加1
		c.add(Calendar.MONTH, 1);
		//让月份在设置成月初 2019-08-01 00:00:00
		Date date = getDateByInitMonth(c.getTime());
		c.setTime(date);
		//让秒-1
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
		// TODO 实现代码
	}
}
