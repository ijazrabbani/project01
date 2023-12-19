package ecommerce.Batch8TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
public class classbeforeandafter {public static WebDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.out.println("This is before Class");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\brook\\.p2\\SELENIUM\\src\\newdriver\\chromedriver-win64\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://www.dominos.com");
      driver.manage().window().maximize();
      Thread.sleep(5000);
  }
  @Test
  public void f() throws InterruptedException {
	  WebElement clickpopup=   driver.findElement(By.xpath("(//*[@fill='#ffffff'])[6]"));
	  clickpopup.click();
	  Thread.sleep(5000);
	  WebElement orderonline=   driver.findElement(By.xpath("//*[text()='Order Online']"));
	  orderonline.click();
	  Thread.sleep(5000); 
  	  WebElement deliverytab=   driver.findElement(By.xpath("//*[@id='tab-Delivery']"));
	  deliverytab.click();
	  Thread.sleep(5000);
  WebElement dropdown=     driver.findElement(By.xpath("//*[@id='Type']"));
	dropdown.click();
	Select ob=new Select(dropdown);
	  ob.selectByVisibleText("Business");
	  Thread.sleep(5000);
	WebElement businessname=  driver.findElement(By.xpath("//*[@id='LocationName']"));
	businessname.sendKeys("brookfield dental office");
	  WebElement streetaddress=   driver.findElement(By.xpath("//*[@id='Street']"));
	  streetaddress.sendKeys("7108");
	  Thread.sleep(5000);
	  WebElement suite=  driver.findElement(By.xpath("//*[@id='UnitNumber']"));
		suite.sendKeys("1");
		Thread.sleep(5000);
		 WebElement postalcode=  driver.findElement(By.xpath("//*[@id='PostalCode']"));
			postalcode.sendKeys("22150-2215");
			Thread.sleep(5000);
			WebElement city=  driver.findElement(By.xpath("//*[@id='City']"));
			city.sendKeys("Springfield");
			Thread.sleep(5000);
			WebElement dropdownstate=     driver.findElement(By.xpath("//*[@id='Region']"));
			dropdownstate.click();
			Select ob2=new Select(dropdownstate);
			  ob2.selectByVisibleText("VA");
			  Thread.sleep(5000);
	  WebElement delivery=  driver.findElement(By.xpath("//*[text()='Continue for Delivery']"));
		delivery.click();
		Thread.sleep(5000);
		WebElement timedropdown=   driver.findElement(By.xpath("//*[@name='Future_Time']"));
		timedropdown.click();
		Select ob3=new Select(timedropdown);
		ob3.selectByVisibleText("11:15pm");
		Thread.sleep(10000);
  }
 @AfterClass
  public void afterClass() {
	  System.out.println("This is after Class");
	  
	   }
}