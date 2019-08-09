package com.sj.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;

public class FileUtilTest {
	
	Scanner sc = new Scanner(System.in);
	
	@Test
	public void testGetExtendName() {
		
		String str = sc.next();
	
		String name = FileUtil.getExtendName(str);
		
		System.out.println(name);
		
		
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File userDirectory = FileUtil.getUserDirectory();
		System.out.println(userDirectory);
	}

}
