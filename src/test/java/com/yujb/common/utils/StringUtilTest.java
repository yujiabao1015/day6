package com.yujb.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void testIsNumber() {
		System.out.println(StringUtil.isNumber("111111111"));
	}
	@Test
	public void testIsPhone() {
		System.out.println(StringUtil.isPhone("18994461347"));
	}
	@Test
	public void testIsEMail() {
		System.out.println(StringUtil.isEMail("www.1739916324@qq.com"));
	}
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
