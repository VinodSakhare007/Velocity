package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VinodSuite {

	@BeforeTest
	@Parameters("testData")
	public void beforeTest(String data) {
		System.out.println(data);
		System.out.println("beforeTest VinodSuite");
	}
	@BeforeClass
	public void beforeClass(){
	System.out.println("before class VinodSuite");	
	}

	@BeforeMethod
    public void beforeMethod() {
	System.out.println("before method VinodSuite");	
	}

	@Test
	public void testA()  {
    System.out.println("test A");		
	}

	@Test
	public void testB () {
	System.out.println("test B ");	
	}

	@Test
	public void testC () {
	System.out.println("test C ");	
	}

	@Test
	public void testD () {
	System.out.println("test D");	
	}

	@AfterMethod
	public void afterMethod() {
	System.out.println("afterMethod VinodSuite");	
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass VinodSuite");
	}

	@AfterTest
	public void afterTest() {
	System.out.println("afterTest VinodSuite");
	}
	
	
}
