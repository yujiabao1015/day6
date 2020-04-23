package com.yujb.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		
		System.out.println(StringUtil.hasLength("a"));
	}

	@Test
	public void testHasText() {
		System.out.println(StringUtil.hasText("a  "));
	}

	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(3));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
