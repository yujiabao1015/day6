package com.yujb.common.utils;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		StreamUtil.closeAll(new InputStreamReader(null),new BufferedInputStream(null),new BufferedReader(null));
	}
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String path = "C:\\url\\1801\\test.txt";
		String string = StreamUtil.readTextFile(new FileInputStream(path));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String path = "C:\\url\\1801\\test.txt";
		String string = StreamUtil.readTextFile(new File(path));
		System.out.println(string);
	}

	@Test
	public void testReadTextFile2List() {
		String path = "C:\\url\\1801\\test.txt";
		List<String> list = StreamUtil.readTextFile2List(new File(path));
		System.out.println(list);
	}

}
