package DigiSetUp;

import org.testng.annotations.Test;

import DigiPage.LoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;


public class SetUp {
  
  WebDriver driver;
  LoginPage objLoginPage;
  

  @BeforeTest
  public void launch() {
	  System.setProperty("webdriver.chrome.driver", "/Users/gsns/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apptest.digiboxx.com/login");
  }

  
  @Test
  public void login() {
  LoginPage login = PageFactory.initElements(driver, LoginPage.class);
  login.logindigiboxx("Intern3", "testing2510932@gmail.com", "Gaurav@123");
  }
  }


