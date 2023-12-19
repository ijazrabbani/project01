package ecommerce.Batch8TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestdp extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String password) throws InterruptedException {
	  Homeclass ob=new Homeclass(driver);
	  ob.email_field(email);
	  Thread.sleep(3000);
	  ob.password_field(password);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc@yahoo.com", "aijaz123456789" },
      new Object[] { "def@yahoo.com", "aijaz123456789" },
    };
  }
}
