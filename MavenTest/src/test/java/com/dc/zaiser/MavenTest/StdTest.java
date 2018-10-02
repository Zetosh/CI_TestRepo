package com.dc.zaiser.MavenTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class StdTest {
	public static final long num1 = 1;
	public static final long num2 = 2;
		
	@Test
	public void mathTest() {
		assertTrue(Calculator.addNumbers(num1, num2) == 3);
	}
	
	@Test
	public void mathTest2() {
		assertTrue(Calculator.addNumbersWrongly(num1, num2) == 3);
	}

}
