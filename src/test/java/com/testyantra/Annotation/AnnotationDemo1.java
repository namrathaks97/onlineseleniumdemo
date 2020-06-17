package com.testyantra.Annotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 extends AnnotationDemo3 
{
	@BeforeClass
	public void beforeClassOne()
	{
		System.out.println("Before class Executed in demo 1");
	}
	
	@AfterClass
	public void afterClassOne()
	{
		System.out.println("After class Executed in demo 2");
	}
	
	@Test
	public void tc_01()
	{
		System.out.println("Executed tc_01");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method Executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method Executed");
	}
}
