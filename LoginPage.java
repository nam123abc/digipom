package DigiPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how=How.ID, using= "workspace")
	WebElement digispace;

	@FindBy(how=How.ID, using= "Usename")
	WebElement username;

	@FindBy(how=How.ID, using= "Password")
	WebElement password;
	
	@FindBy(how=How.XPATH, using= "//button[@class=\"start-btn\"]")
	WebElement loginButton;


	public void logindigiboxx(String Digi,String user,String passw) {
		digispace.sendKeys(Digi);
		username.sendKeys(user);
		password.sendKeys(passw);
		loginButton.click();
	
	}
	}
