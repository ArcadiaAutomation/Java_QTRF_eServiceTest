package com.application;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import com.qtrf.core.DriverManager;




public class Test1 {
	
//	public static void main(String[] args) {
//		
//		JUnitCore core = new JUnitCore(); 
//		core.run(DriverManager.class);
//		
//	
//	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello Hello Hello");
		JUnitCore core = new JUnitCore(); 
		core.run(DriverManager.class);
	}
	
	@Test
	public void TestEasy()
	{
		
		assertEquals(5,5);
	}

}
