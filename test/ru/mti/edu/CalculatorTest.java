package ru.mti.edu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest extends Assert {

	@Before
	public void before(){
		System.out.println("before");
	}
	
	@After
	public void after(){
		System.out.println("after");
	}
	
	@Test
	public void testSumma(){
		Calculator c = new Calculator();
		assertEquals(5, c.summa(2, 3));
		assertEquals(6, c.summa(2, 4));
		assertEquals(1, c.summa(-1, 2));
		assertEquals(10000000, c.summa(0, 10000000));
		assertEquals(100, c.summa(10, 90));
	}
	
	@Ignore
	@Test
	public void testDif(){
		Calculator c = new Calculator();
		assertEquals(-1, c.dif(2, 3));
		assertEquals(-2, c.dif(2, 4));
		assertEquals(-3, c.dif(-1, 2));
		assertEquals(-10000000, c.dif(0, 10000000));
		assertEquals(-80, c.dif(10, 90));
	}
}
