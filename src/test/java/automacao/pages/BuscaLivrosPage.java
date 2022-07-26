package automacao.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import automacao.core.Driver;
import automacao.maps.BuscaLivrosMap;

public class BuscaLivrosPage {
	
	BuscaLivrosMap buscaLivrosMap;
	
	
	public BuscaLivrosPage()   {
		buscaLivrosMap = new BuscaLivrosMap();
		PageFactory.initElements(Driver.getDriver(), buscaLivrosMap);
		
	}
	
	
	public void clickBtnBookStore()  {
		
		buscaLivrosMap.btnBookStoreMenuPrincipal.click();
		buscaLivrosMap.btnBookStoreMenuPrincipal.click();

		
	}	
	
	public void clicaCampoBuscaLivros() {
		buscaLivrosMap.inputBuscaBookName.clear();
		buscaLivrosMap.inputBuscaBookName.click();

	}
	
	public void setInputBookName(String bookName) {
		buscaLivrosMap.inputBuscaBookName.sendKeys(bookName);		
	} 
	
	public void clickTitleBookName() {
		Driver.visibilityOf(buscaLivrosMap.linkTitleBookName);
		buscaLivrosMap.linkTitleBookName.click();
		
	}
	
	public void clickBtnAddToYourColletion(){
		buscaLivrosMap.btnAddBookName.click();		
	}

}
