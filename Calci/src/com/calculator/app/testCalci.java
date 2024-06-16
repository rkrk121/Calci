package com.calculator.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalci {

	@Test
	void test() 
	{
	  int res=Runner.add(10, 10);
	  assertEquals(20, res);
	  assertEquals(30,Runner.add(10, 20));
      assertEquals(50,Runner.add(15, 35));	  
	}
	@Test
	void Testcheck()
	{
		assertTrue(Runner.check(10));
		assertTrue(Runner.check(15));
		//assertFalse(Runner.check(15));
	}
	@Test
	void testNull()
	{
		Runner run=null;
		assertNull(run);
		Runner running=new Runner();
		assertNotNull(running);
	}

}
