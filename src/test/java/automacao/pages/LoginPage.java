package automacao.pages;

import org.openqa.selenium.support.PageFactory;

import automacao.core.Driver;
import automacao.maps.LoginMap;

public class LoginPage {
	
	LoginMap loginMap;
	
	public LoginPage() {
		loginMap = new LoginMap();
		
		PageFactory.initElements(Driver.getDriver(), loginMap);
	}
	
	
	public void clickBtnLogin() {
		loginMap.btnLogin.click();
		
	}
	
	public void setInputName(String username) {
		loginMap.inputUserName.sendKeys(username);
		
	} 
	
	public void setInputPassword(String password) {
		loginMap.inputPassword.sendKeys(password);
		
	}
	
    public String getUsuarioLogado(){
        Driver.visibilityOf(loginMap.txtLogado);
        return loginMap.txtLogado.getText();
    }
    
    public void visibilityOfBtnLogar(){
        Driver.visibilityOf(loginMap.btnLogin);
    }
    
    public void invisibilityOfBtnLogar(){
        Driver.invisibilityOf(loginMap.btnLogin);
    }
    
}
