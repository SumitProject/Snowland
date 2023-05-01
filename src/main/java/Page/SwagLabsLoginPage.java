package Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BrowserOpen;

public class SwagLabsLoginPage extends BrowserOpen {
	 @FindBy(xpath="//input[@id='user-name']") private WebElement userName ;
	    @FindBy(xpath="//input[@id='password']") private WebElement passWord ;
	    @FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn ;

	    public SwagLabsLoginPage()
	    {
	        PageFactory.initElements(driver,this);
	    }

	    public void user_pass_valid_username_and_password(String un,String pw) {

	        userName.sendKeys(un);
	        passWord.sendKeys(pw);

	    }
	    public void user_click_on_login_button() {
	        loginBtn.click();

	    }
	       
	    
}
