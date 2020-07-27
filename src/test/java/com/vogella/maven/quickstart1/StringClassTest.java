package com.vogella.maven.quickstart1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.vogella.maven.quickstart1.StringClass;

public class StringClassTest 
{
	//Yesu Prabhu and Mary Matha and Joseph
		@Test
		public void test1() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("ABCD");
			assertEquals("BCD",actual);
		}
		@Test
		public void test2() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("AACD");
			assertEquals("CD",actual);
		}
		@Test
		public void test3() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("BACD");
			assertEquals("BCD",actual);
		}
		@Test
		public void test4() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("BBAA");
			assertEquals("BBAA",actual);
		}
		@Test
		public void test5() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("AABAA");
			assertEquals("BAA",actual);
		}
		@Test
		public void test6() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("");
			assertEquals("",actual);
		}
		@Test
		public void test7() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("A");
			assertEquals("",actual);
		}
		@Test
		public void test8() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("B");
			assertEquals("B",actual);
		}
		@Test
		public void test9() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("AB");
			assertEquals("B",actual);
		}
		@Test
		public void test10() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("BA");
			assertEquals("B",actual);
		}
		@Test
		public void test11() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("AA");
			assertEquals("",actual);
		}
		@Test
		public void test12() {
			StringClass stringclass = new StringClass();
			String actual = stringclass.method("BB");
			assertEquals("BB",actual);
		}
}
