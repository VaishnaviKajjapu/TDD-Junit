package com.epam.TDDandJunit;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveAInFirst2PosTest {
	
	
	
	RemoveAInFirst2Pos removeAInFirst2Pos;
	
	@BeforeEach
	public void setUp() {
		removeAInFirst2Pos = new RemoveAInFirst2Pos();
	}
	
	
	@Test
	public void test0Chars() {
		assertEquals("", removeAInFirst2Pos.remove(""));
	}
	
	@Test
	public void test1CharRemoveA() {
		assertEquals("", removeAInFirst2Pos.remove("A"));
	}
	
	@Test
	public void test1CharNoAAtFirst() {
		assertEquals("B", removeAInFirst2Pos.remove("B"));
	}
	
	@Test
	public void test2CharsRemove2AChars() {
		assertEquals("", removeAInFirst2Pos.remove("AA"));
	}
	
	@Test
	public void test2CharsRemove1AAtFirst() {
		assertEquals("B", removeAInFirst2Pos.remove("AB"));
	}
	
	@Test
	public void test2CharsRemove1AAtSecond() {
		assertEquals("B", removeAInFirst2Pos.remove("BA"));
	}
	
	@Test
	public void test4CharsRemove2As() {
		assertEquals("CD", removeAInFirst2Pos.remove("AACD"));
	}
	
	@Test
	public void test4CharsRemove1AAtFirst() {
		assertEquals("BCD", removeAInFirst2Pos.remove("ABCD"));
	}
	
	@Test
	public void test4CharsRemove1AAtSecond() {
		assertEquals("BCD", removeAInFirst2Pos.remove("BACD"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", removeAInFirst2Pos.remove("AABAA"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAA", removeAInFirst2Pos.remove("AAAAAAA"));
	}

}