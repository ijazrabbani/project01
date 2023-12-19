package ecommerce.Batch8TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Parentclass extends baseclass { //focus on this line we here use word extends baseclass
//for parallel testing we only need to remove word static from public static at start of this line.

	  @Test (groups= {"regression"})
	  public void test1() throws InterruptedException, IOException {	
		  Properties prop = new Properties();
		  FileInputStream fin = new FileInputStream("C:\\Users\\brook\\.p2\\Batch8TestNG\\src\\test\\java\\ecommerce\\Batch8TestNG\\userdetails.properties");
		  prop.load(fin);
		  String email= prop.getProperty("Email");
		  String password= prop.getProperty("Password");
		  
		  Homeclass ob=new Homeclass(driver);
		  ob.email_field(email);
		  Thread.sleep(3000);
		  ob.password_field(password);
		  shots_withCurrentDateTime();
	  }

@Test (groups= {"regression"})
public void test2() throws InterruptedException, IOException {	
	Homeclass ob=new Homeclass(driver);
	  ob.email_field("def@yahoo.com");
	  Thread.sleep(3000);
	  ob.password_field("Aijaz123456789@");
	  shots_withCurrentDateTime();
	
}
@Test (groups= {"functional"})
public void test3() throws InterruptedException, IOException {	
	Homeclass ob=new Homeclass(driver);
	  ob.email_field("ghi@yahoo.com");
	  Thread.sleep(3000);
	  ob.password_field("Aijaz123456789@");
	  shots();
} 
@Test (priority=4)
public void test4() throws InterruptedException, IOException {	
	Homeclass ob=new Homeclass(driver);
	  Thread.sleep(3000);
	  ob.textextract_function();
	  shots_withCurrentDateTime();
}
  
}