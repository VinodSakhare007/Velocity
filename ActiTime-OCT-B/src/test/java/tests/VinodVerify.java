package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VinodVerify {
	public class VinodSuite {

		
		@BeforeTest
		public void beforeTest() {
			System.out.println("beforeTest VinodVerify");
		}
		
		@BeforeClass
		public void beforeClass(){
		System.out.println("before class VinodVerify");	
		}

		@BeforeMethod
	    public void beforeMethod() {
		System.out.println("before method VinodVerify");	
		}

		@Test
		public void testE()  {
	    System.out.println("test E");		
		}

		@Test
		public void testF () {
		System.out.println("test F");	
		}

		@Test
		public void testG () {
		System.out.println("test G");	
		}

		@Test
		public void testH () {
		System.out.println("test H");	
		}

		@AfterMethod
		public void afterMethod() {
		System.out.println("afterMethod VinodVerify");	
		}

		@AfterClass
		public void afterClass() {
			System.out.println("afterClass VinodVerify");
		}
		@AfterTest
		public void afterTest() {
			System.out.println("afterTest VinodVerify");
		}
		
}
}