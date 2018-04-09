package one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest 
{
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("In before suite in newtest");
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("In after suite in newtest");
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("In Before Test in newtest");
  }
  
  @AfterTest
  public void aftertest()
  {
	  System.out.println("In After Test in newtest");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("In Before Method in newtest");
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("In After Method  in newtest");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("In Before class in newtest");
  }
  
  @AfterClass
  public void afterclass()
  {
	  System.out.println("In After class in newtest");
  }
  
  @Test
  public void testclass()
  {
	  System.out.println("In Test class in newtest");
  }
}