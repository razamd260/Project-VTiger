package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogout {
  @FindBy(name="user_name")
  private WebElement user;
  @FindBy(name="user_password")
  private WebElement pwd;
  @FindBy(id="submitButton")
  private WebElement submit;

  
  public  LoginLogout(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  public void loging(String user1,String pwd1) {
	  user.sendKeys(user1);
	  pwd.sendKeys(pwd1);
	  submit.click();
	  
  }

}
