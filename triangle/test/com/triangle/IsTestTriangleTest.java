package com.triangle;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class IsTestTriangleTest {
	@Test
	public void TestIsTriangle1(){
		assertEquals("equilateral", new IsTriangle().just(5, 5, 5));
	}
	@Test
	public void TestIsTriangle2(){
		assertEquals("isosceles", new IsTriangle().just(5, 5, 8));
	}
	@Test
	public void TestIsTriangle3(){
		assertEquals("scalene", new IsTriangle().just(4, 5, 6));
	}
	@Test
	public void TestIsTriangle4(){
		assertEquals("not a triangle", new IsTriangle().just(1, 2, 3));
	}
}
