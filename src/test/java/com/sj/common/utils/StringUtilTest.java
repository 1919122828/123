package com.sj.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		
	}

	@Test
	public void testHasText() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandmoChoneseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomchaineseSreing() {
		System.out.println(StringUtil.randomchaineseSreing(10));
		System.out.println(StringUtil.randomchaineseSreing(10));
	}

	@Test
	public void testGenerateChinsesName() {
		for (int i = 0; i < 13; i++) {
			System.out.println(StringUtil.generateChinsesName());
		}
	}

}
