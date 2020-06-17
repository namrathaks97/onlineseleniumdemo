package com.testyantra.Annotation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AnnotationDemo3 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class Executed");
	}
}
