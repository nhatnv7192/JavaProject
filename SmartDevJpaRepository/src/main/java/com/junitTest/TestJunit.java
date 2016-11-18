package com.junitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;

import com.entitiesJunitest.TestNumber;

public class TestJunit {
	
	private int testNumber =12;
	
	
	public int getTestNumber() {
		return testNumber;
	}
	public void setTestNumber(int testNumber) {
		this.testNumber = testNumber;
	}
	//check in Number > 6
	public boolean checkNumberGreateThan6()
	{
		if(this.testNumber > 6)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//check in Number < 10
	public boolean checkNumberSmallThan10()
	{
		if(this.testNumber < 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Test
	public void testNumberGreateThan6()
	{	
		assertTrue(checkNumberGreateThan6());
		System.out.println("In ra so :"+testNumber);
		
	}
	@Test
	public void testNumberSmallThan10()
	{
		assertTrue(checkNumberSmallThan10());
	}
}
