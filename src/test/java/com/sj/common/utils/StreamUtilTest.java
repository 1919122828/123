package com.sj.common.utils;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() throws Exception {
		FileInputStream inputStream = new FileInputStream("src/test/java/com/sj/common/utils/StreamUtilTest.java");
		
		String file = StreamUtil.readTextFile(inputStream);
		System.out.println(file);
		
	}

	@Test
	public void testReadTextFileInputStream() throws Exception {
		FileInputStream inputStream = new FileInputStream("src/test/java/com/sj/common/utils/StreamUtilTest.java");
		
		String file = StreamUtil.readTextFile(inputStream);
		
		System.out.println(file);
		
	}

	@Test
	public void testReadTextFileFile() {
		fail("Not yet implemented");
	}

}
