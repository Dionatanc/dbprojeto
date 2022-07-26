package automacao.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaLivrosMap {
	
	@FindBy (xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/span/div/div[1]")
	public WebElement btnBookStoreMenuPrincipal;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div/div[1]")
	public WebElement btnBookStore;
	
	@FindBy(id = "searchBox")
	public WebElement inputBuscaBookName;
	
	@FindBy(id = "addNewRecordButton")
	public WebElement btnAddBookName;
	
	@FindBy(id = "see-book-Speaking JavaScript")
	public WebElement linkTitleBookName;

}
