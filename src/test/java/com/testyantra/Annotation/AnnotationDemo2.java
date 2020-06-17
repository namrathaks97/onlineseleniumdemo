package com.testyantra.Annotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 extends AnnotationDemo3 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class Executed in demo 2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class Executed in demo 2");
	}
	
	@Test
	public void tc_02()
	{
		System.out.println("Executed tc_02");	
	}
}
