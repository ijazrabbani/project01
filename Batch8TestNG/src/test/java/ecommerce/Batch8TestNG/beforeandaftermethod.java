package ecommerce.Batch8TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class beforeandaftermethod { public static WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.out.println("This is before method");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\brook\\.p2\\SELENIUM\\src\\newdriver\\chromedriver-win64\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://www.homedepot.com");
      driver.manage().window().maximize();
      Thread.sleep(5000);
  }
  @Test
  public void f() throws InterruptedException {
	  System.out.println("This is method");
	  WebElement myaccount=   driver.findElement(By.xpath("(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
      myaccount.click();
	  Thread.sleep(5000);  
	  
	  
	  WebElement signin=   driver.findElement(By.xpath("//*[text()=' Sign in ']"));
      signin.click();
	  Thread.sleep(5000);  
	  
	  WebElement createnew=  driver.findElement(By.xpath("//*[text()='Create an Account']"));
      createnew.click();
	  Thread.sleep(5000);
	  
	  WebElement personalaccount=   driver.findElement(By.xpath("//*[contains(text(),'Personal Account')]"));
      personalaccount.click();
	  Thread.sleep(5000); WebElement emailaddress=   driver.findElement(By.xpath("(//*[@id='email'])[1]"));
      emailaddress.sendKeys("abc@gmail.com");
	  Thread.sleep(5000); 
	  
	  
	  WebElement passwordfield=   driver.findElement(By.xpath("//*[@id='password-input-field']"));
      passwordfield.sendKeys("Aijaz123456789#");
	  Thread.sleep(5000); 
	  
	  
	  WebElement mobileno=   driver.findElement(By.xpath("//*[@id='phone']"));
      mobileno.sendKeys("5719915896");
	  Thread.sleep(5000); 
	  
	  
	  WebElement checkbox=   driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']"));
      checkbox.click();
      Thread.sleep(5000); 
      
      
	  
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  System.out.println("This is after method");
	  WebElement Createaccount=   driver.findElement(By.xpath("(//*[text()='Create an Account'])[2]"));
      Createaccount.click();
	  Thread.sleep(5000);
	  driver.close();
	  }
}