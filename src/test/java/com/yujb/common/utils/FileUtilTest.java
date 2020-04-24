package com.yujb.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String name = FileUtil.getExtendName("aaatxt.txt");
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		System.out.println(FileUtil.getTempDirectory());
	}

	@Test
	public void testGetUserDirectory() {
		System.out.println(FileUtil.getUserDirectory());
	}

}
