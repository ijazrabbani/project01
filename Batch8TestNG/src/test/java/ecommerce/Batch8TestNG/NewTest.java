package ecommerce.Batch8TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class NewTest {public static WebDriver driver;  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("This is before test");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\brook\\.p2\\SELENIUM\\src\\newdriver\\chromedriver-win64\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://www.homedepot.com");
      driver.manage().window().maximize();
      Thread.sleep(5000);
	   }
  @Test
  public void test1() throws InterruptedException {
	  WebElement myaccount=   driver.findElement(By.xpath("(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
      myaccount.click();
      Thread.sleep(5000);
	  
  }
  @Test
  public void test2() throws InterruptedException {
	  WebElement signin=   driver.findElement(By.xpath("//*[text()=' Sign in ']"));
      signin.click();
      Thread.sleep(5000);
	  
  }
  
  @Test
  public void test3() throws InterruptedException {
	  WebElement createnew=  driver.findElement(By.xpath("//*[text()='Create an Account']"));
      createnew.click();
      Thread.sleep(5000);
	  }
  @Test
  public void test4() throws InterruptedException {
	  WebElement personalaccount=   driver.findElement(By.xpath("//*[contains(text(),'Personal Account')]"));
      personalaccount.click();
      Thread.sleep(5000);
  }
  @Test
  public void test5() throws InterruptedException {
	  WebElement emailaddress=   driver.findElement(By.xpath("(//*[@id='email'])[1]"));
      emailaddress.sendKeys("abc@gmail.com");
      Thread.sleep(5000);
	  
  }
  @Test
  public void test6() throws InterruptedException {
	  WebElement passwordfield=   driver.findElement(By.xpath("//*[@id='password-input-field']"));
      passwordfield.sendKeys("Aijaz123456789#");
      Thread.sleep(5000);
  }
  @Test
  public void test7() throws InterruptedException {
	  WebElement mobileno=   driver.findElement(By.xpath("//*[@id='phone']"));
      mobileno.sendKeys("5719915896");
      Thread.sleep(5000);
	  
  }
  @Test
  public void test8() throws InterruptedException {
	  WebElement checkbox=   driver.findElement(By.xpath("//*[@for='verify-phone-checkbox']"));
      checkbox.click();
      Thread.sleep(5000);
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  WebElement Createaccount=   driver.findElement(By.xpath("(//*[text()='Create an Account'])[2]"));
      Createaccount.click();
	  Thread.sleep(5000);
	  driver.close();
}
}