package cos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Logs extends BasePage {
	
	
	@FindBy(how = How.ID, using  = "signin-email")
	public WebElement UserName;
	
	@FindBy(how = How.ID, using  = "signin-password")
	public WebElement Password;
	
	@FindBy(how = How.ID, using  = "signin-button")
	public WebElement LoginButton;

}
