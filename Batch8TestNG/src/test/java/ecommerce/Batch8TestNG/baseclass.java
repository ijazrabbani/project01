package ecommerce.Batch8TestNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {
	public WebDriver driver;
	 @BeforeMethod(alwaysRun = true)
	  @Parameters({"selectedbrowser"})
	  public void beforeMethod(String selectedbrowser) throws InterruptedException {
		  System.out.println("This is before method");
		  String brow=selectedbrowser;
		  if (brow.contains("chrome")){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\brook\\.p2\\SELENIUM\\src\\newdriver\\chromedriver-win64\\chromedriver.exe");
		  driver=new ChromeDriver();
		  }
		  else if(brow.contains("firefox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\brook\\.p2\\SELENIUM\\src\\Drivers\\chromedriver-win64 (1)\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  }
		  else {
		  System.setProperty("webdriver.edge.driver","C:\\Users\\brook\\.p2\\SELENIUM\\src\\Drivers\\chromedriver-win64\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  }
		  driver.get("http://www.facebook.com");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  }
	 @AfterMethod(alwaysRun = true)
	  public void afterMethod() {
		  System.out.println("This is after method");
		  driver.close();
	  }

	  public void shots() throws IOException {
	 File cap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\brook\\.p2\\Batch8TestNG\\Screenshots\\1.png"));
	}
	  public void shots_withArgs(String Filename) throws IOException {
		  File cap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileHandler.copy(cap, new File("C:\\Users\\brook\\.p2\\Batch8TestNG\\Screenshots\\"+Filename+".png"));
		 }
	  public void shots_withCurrentDateTime() throws IOException {
		  Date dt = new Date();
		  String Filename = dt.toString().replace(" ", "_").replace(":", "_");
		  File cap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileHandler.copy(cap, new File("C:\\Users\\brook\\.p2\\Batch8TestNG\\Screenshots\\"+Filename+".png"));
		 }

}
