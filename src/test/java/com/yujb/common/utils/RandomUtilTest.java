package com.yujb.common.utils;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(6, 1);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] s = RandomUtil.subRandom(1, 6, 3);
		System.out.println(Arrays.toString(s));
	}

	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	public void testRandomString() {
		String s = RandomUtil.randomString(4);
		System.out.println(s);
	}

}
