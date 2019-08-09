package com.sj.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		
		for (int i = 0; i < 10; i++) {
			
			int x = RandomUtil.random(1,3);
			System.out.println(x);
		}
		
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 6, 5);
		
		
		
	}

	@Test
	public void testRandomString() {
		for (int i = 0; i < 10; i++) {
			char c = RandomUtil.randomCharacter();
			System.out.println(c);
		}
		
	}

}
