package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test {

	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("madam"));
	}
}
