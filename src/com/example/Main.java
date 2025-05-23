package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// Test class, non-public
class MainTest {

    @org.junit.Test
    public void testSomething() {
        org.junit.Assert.assertEquals(4, 2 + 2);
    }
}
