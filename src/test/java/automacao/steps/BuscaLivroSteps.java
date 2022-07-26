package automacao.steps;

import java.util.Map;

import automacao.pages.BuscaLivrosPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class BuscaLivroSteps{
	
	BuscaLivrosPage buscaLivroPage;
	Map<String, String> mapDados;
	
	@Quando ("for realizado clique em BookStore")
	public void forRealizadoCliqueEmBookstore() {
		buscaLivroPage = new BuscaLivrosPage();
		buscaLivroPage.clickBtnBookStore();
		
	}
	
	
@Quando("pesquiso os valores dos seguintes livros")
public void pesquisoOsValoresDosSeguintesLivros(Map<String, String> map) {
	mapDados = map;
	buscaLivroPage = new BuscaLivrosPage();
	buscaLivroPage.clicaCampoBuscaLivros();
	buscaLivroPage.setInputBookName(map.get("bookname"));
	buscaLivroPage.clickTitleBookName();
	}


@Quando ("for realizado clique em Add to Your Collection")
public void forRealizadoCliqueEmAddToYourCollection(){
	buscaLivroPage.clickBtnAddToYourColletion();
	
	
	}


@Entao("o livro e adicionado a colecao")
public void oLivroEAdicionadoAColecao() {
	buscaLivroPage.clickBtnAddToYourColletion();
	
	}

}