package com.myapp;

import static org.junit.Assert.*;

import org.junit.Test;

import com.myapp.myapp.Calcurator;

public class CalcuratorTest {

	@Test
	public void testSum() {
		Calcurator c = new Calcurator();
        double result = c.sum(10, 50);                                   
        assertEquals(60, result, 0);    
	}

}
