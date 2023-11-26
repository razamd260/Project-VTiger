package Generic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.LeadModules;
import POM.LoginLogout;






public class BaseClass {
     protected PropertiesFileUtility pro;
     protected WebDriverUtility web;
     protected LoginLogout login;
      WebDriver driver;
     protected LeadModules lead;
     @BeforeClass
     public void classConfig() {
    	 System.out.println("BeforClass");
    	 
    	 pro=new PropertiesFileUtility();
    	 web=new WebDriverUtility();
    	
    	 
    	 pro.propertiesInt(IConstantPath.PROPERTIES_PATH);
    	 String url=pro.getproperty("url");
    	 String browser=pro.getproperty("browser");
  
    	 long time=Long.parseLong(pro.getproperty("time"));
//    	 System.out.println(url+browser+time);
       	WebDriver driver= web.Applaunch(browser, url, time);
       	login=new LoginLogout(driver);
        lead=new LeadModules(driver);
       }


   @BeforeMethod
   public void close() {
	   System.out.println("BeforeMethod");
	
	  	 String user1=pro.getproperty("user");
    	 String pwd1=pro.getproperty("password");
    	 login.loging(user1, pwd1);
	  }



}
