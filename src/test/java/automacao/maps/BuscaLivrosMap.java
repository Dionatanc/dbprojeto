package automacao.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaLivrosMap {
	
	@FindBy(id = "item-2")
	public WebElement btnBookStore;
	
	@FindBy(id = "searchBox")
	public WebElement inputBuscaBookName;
	
	@FindBy(id = "addNewRecordButton")
	public WebElement btnAddBookName;

}
