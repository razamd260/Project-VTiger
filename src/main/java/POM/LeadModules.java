package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadModules {
	  @FindBy(xpath="//img[@onmouseout=\"fnRemoveWindow();\"]")
	  private WebElement modules;
	

	  
	  public  LeadModules(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	  public void leadmod() {
		  modules.click();
		  
	  }
}
