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

public class NewTest2 
{
  @BeforeSuite
  public void beforesuite()
  {
	  System.out.println("In before suite in newtest2");
  }
  
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("In after suite in newtest2");
  }
  
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("In Before Test  in newtest2");
  }
  
  @AfterTest
  public void aftertest()
  {
	  System.out.println("In After Test in newtest2");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("In Before Method in newtest2");
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("In After Method in newtest2");
  }
  
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("In Before class in newtest2");
  }
  
  @AfterClass
  public void afterclass()
  {
	  System.out.println("In After class in newtest2");
  }
  
  @Test
  public void testclass()
  {
	  System.out.println("In Test class in newtest2");
  }
}