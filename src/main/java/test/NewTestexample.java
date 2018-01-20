package test;


import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestexample {
private WebDriver driver;  

@Test          
public void testselenium() throws InterruptedException {    

  driver.get("http://google.in");
  
  String title = driver.getTitle();      
  Assert.assertTrue(title.contains("Google"));   
}    
@BeforeTest  
public void beforeTest() {    
   
  driver = new FirefoxDriver();    
}      
@AfterTest  
public void afterTest() {  
  driver.quit();        
  
}      

}
