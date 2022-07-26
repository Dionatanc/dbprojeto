package automacao.pages;

import org.openqa.selenium.support.PageFactory;

import automacao.core.Driver;
import automacao.maps.BuscaLivrosMap;
import automacao.maps.LoginMap;

public class BuscaLivrosPage {
	
	BuscaLivrosMap buscaLivrosMap;
	
	
	public BuscaLivrosPage()  {
		buscaLivrosMap = new BuscaLivrosMap();
		
		PageFactory.initElements(Driver.getDriver(), buscaLivrosMap);
	}
	
	public void clickBtnBookStore() {
		buscaLivrosMap.btnBookStore.click();
	}	
	
	public void clicaCampoBuscaLivros() {
		buscaLivrosMap.inputBuscaBookName.click();

	}
	
	public void setInputBookName(String bookName) {
		buscaLivrosMap.inputBuscaBookName.sendKeys(bookName);		
	} 
	
	public void clickBtnAddToYourColletion(){
		buscaLivrosMap.btnAddBookName.click();
		
	}

}
