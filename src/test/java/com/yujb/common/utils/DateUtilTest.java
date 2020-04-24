package com.yujb.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandom() {
		Calendar c = Calendar.getInstance();
		c.set(2017, 1, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(DateUtil.random(c.getTime(), new Date())));
	}
	@Test
	public void testGetAgeByBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 4, 15);
		System.out.println(DateUtil.getAgeByBirthday(c.getTime()));
	}
	@Test
	public void getInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(1998, 4, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(DateUtil.getInitMonth(c.getTime())));
	}
	@Test
	public void getEndMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2020, 3, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(DateUtil.getEndMonth(c.getTime())));
	}
}
