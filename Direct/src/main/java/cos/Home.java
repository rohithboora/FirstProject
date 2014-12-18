package cos;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Home extends BasePage {

	@FindBy(how = How.XPATH, using= "//*[@id='nav-bar']/div[2]/ul/li[1]/a")
	public WebElement LoginLink;
	
	@FindBy(how = How.LINK_TEXT, using= "Sign in or register")
	public WebElement Log;

	@FindBy(how = How.CLASS_NAME, using = "tesco-cookie-accept")
	public WebElement cookie;
	
	@FindBy(how = How.XPATH, using= "//*[@class='tesco-cookie-accept']/div[1]/img[1]")
	public WebElement Cookieclose;
}
