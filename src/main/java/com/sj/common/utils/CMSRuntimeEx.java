package com.sj.common.utils;
/**
 * 
 * @ClassName: CMSRuntimeEx 
 * @Description: 自定义异常
 * @author: 19191
 * @date: 2019年8月9日 下午3:35:35
 */
public class CMSRuntimeEx extends RuntimeException{
	
	public static final long serialVersionUiD= 1L;
	
	public CMSRuntimeEx() {
		super();
	}
	
	
	public CMSRuntimeEx(String message) {
		super(message);
	}
	
	

}
