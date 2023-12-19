package ecommerce.Batch8TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homeclass {
	public static WebDriver driver;

	@FindBy(xpath="//*[@id='email']") WebElement email_field;
	@FindBy(xpath="//*[@id='pass']") WebElement password_field;
	@FindBy(xpath="//*[@name='login']") WebElement login_button;
	@FindBy(xpath="//*[contains(text(),'Connect with friends')]") WebElement fb_text;
	public Homeclass(WebDriver driver) {
	Homeclass.driver=driver;
	PageFactory.initElements(driver, this);
	}

public void email_field(String email) {
	email_field.sendKeys(email);
}
public void password_field(String password) {
	password_field.sendKeys(password);	
}
public void login_button(String login) {
	login_button.click();	
	
}
public void textextract_function() throws InterruptedException {
	String actual_text= fb_text.getText();
	Thread.sleep(5000);
	Assert.assertEquals(actual_text, "Connect with friends and the world around you on Facebook.");
	Thread.sleep(5000);
}
}