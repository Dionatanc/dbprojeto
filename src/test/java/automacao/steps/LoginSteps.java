package automacao.steps;

import java.io.IOException;
import java.util.Map;
import org.junit.Assert;
import automacao.core.Driver;
import automacao.enums.Browser;
import automacao.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
	LoginPage loginPage;
	String username;
	String password;
	
	@Before
	public void iniciaNavegador() {
		new Driver(Browser.CHROME);
	}
	
	@After
	public void fechaNavegador() {
		Driver.getDriver().quit();
		
	}
	
	@Dado("que a pagina esteja sendo exibida")
	public void queAPaginaEstejaSendoExibida() {
		Driver.getDriver().get("https://demoqa.com/login");
		loginPage = new LoginPage();
		
	}
	
	@Quando ("os campos de login forem preenchidos da seguinte forma")
	public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) throws IOException {
        username = map.get("login");
        password = map.get("password");
        if(username != null){
            loginPage.setInputName(username);
        }

        if (password != null){
            loginPage.setInputPassword(password);
        }

    }
	
	@Quando("for realizado o clique no botao log in")
	public void forRealizadoOCliqueNoBotaoLogIn() {
		loginPage.clickBtnLogin();
		
	}
	
	@Entao("deve ser possivel entrar no sistema")
	public void deveSerPossivelEntrarNoSistema() throws IOException {
		Assert.assertEquals(username, loginPage.getUsuarioLogado());
		
	}
	
	
	
	
	
}
