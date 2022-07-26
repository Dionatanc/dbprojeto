package automacao.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
	
	
	@FindBy(id = "login")
	public WebElement btnLogin;
	
	@FindBy(id = "userName")
	public WebElement inputUserName;
	
	@FindBy(id = "password")
	public WebElement inputPassword;
	
	@FindBy(id = "newUser")
	public WebElement btnNewUser;
	
	@FindBy (id = "userName-value")
	public WebElement labelUserName;

    @FindBy(id = "userName-value")
    public WebElement txtLogado;
}
