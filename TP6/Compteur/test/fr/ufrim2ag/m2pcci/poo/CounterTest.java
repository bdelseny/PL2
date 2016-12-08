/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrim2ag.m2pcci.poo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author delsenyb
 */
public class CounterTest {
    
    public CounterTest() {
    }

    /**
     * Test of increment method, of class Counter.
     */
    @Test
    public void testIncrement() {
        System.out.println("increment");
        Counter instance = new Counter();
        int expResult = 1;
        instance.increment();
        int result = instance.getCount();
        assertEquals(expResult, result); 
    }

    /**
     * Test of decrement method, of class Counter.
     */
    @Test
    public void testDecrement() {
        System.out.println("decrement");
        Counter instance = new Counter();
        int expResult = -1;
        instance.decrement();
        int result = instance.getCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCount method, of class Counter.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Counter instance = new Counter();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class Counter.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Counter c = new Counter(1);
        Counter instance = new Counter(3);
        Counter expResult = new Counter(4);
        Counter result = instance.add(c);
        assertEquals(expResult.getCount(), result.getCount());
    }

    /**
     * Test of sub method, of class Counter.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        Counter c = new Counter(5);
        Counter instance = new Counter(3);
        Counter expResult = new Counter(-2);
        Counter result = instance.sub(c);
        assertEquals(expResult.getCount(), result.getCount());
    }
    
}
