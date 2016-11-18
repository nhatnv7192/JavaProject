package com.junitTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunJuniTest {
	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(TestJunit.class);
		for(Failure failure :result.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println("In ra ket qua  = "+result.wasSuccessful());
	}
}
