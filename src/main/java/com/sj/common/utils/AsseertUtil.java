package com.sj.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public class AsseertUtil {
	//断言为真
	public static void isTrue(boolean exp,String message) {
		
		if(!exp) {
			throw new CMSRuntimeEx(message);
		}
		
		
	}
	//断言为假
	public static void isFalse(boolean exp,String message) {
		if(exp) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言对象不能为空
	
	public static void isNotNull(Object obj,String message) {
		if(obj==null) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言对象必须为空
	public static void isNot(Object obj,String message) {
		if(obj==null) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言集合不为空,没有元素也算空
	public static void isNotEmptry(Collection c,String message) {
		if(c==null||c.size()==0) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言map集合不为空,没有元素也算空
	public static void isNotMap(Map<?,?> m,String message) {
		if(m==null||m.isEmpty()) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言字段必须有值
	public static void HasTest(String src,String message) {
		if(src==null||src.trim().length()==0) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言必须是正整数
	public static void isPostive(boolean exp,String message) {
		if(!exp) {
			throw new CMSRuntimeEx(message);
		}
	}
	//断言值必须大于0,如果小于等于0抛出异常
	public static void greaterThanZero(BigDecimal value,String message) {
		if(value.doubleValue()<=0) {
			throw new CMSRuntimeEx(message);
		}
	}

}
