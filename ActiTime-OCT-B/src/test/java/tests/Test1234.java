package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1234 {

	
	@BeforeClass
	public void beforeClass(){
	System.out.println("before class");	
	}

	@BeforeMethod
    public void beforeMethod() {
	System.out.println("before method");	
	}

	@Test(timeOut = 3000)
	public void testA() throws InterruptedException {
    System.out.println("test A");		
	Thread.sleep(5000);
	System.out.println("HIIIIIIII");
	}

	@Test(dependsOnMethods = {"testA"})
	public void testB () {
	System.out.println("test B");	
	}

	@Test(invocationCount = 3 , priority = 2)
	public void testC () {
	System.out.println("test C");	
	}

	@Test(enabled = false)
	public void testD () {
	System.out.println("test D");	
	}

	@AfterMethod
	public void afterMethod() {
	System.out.println("afterMethod");	
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

}
