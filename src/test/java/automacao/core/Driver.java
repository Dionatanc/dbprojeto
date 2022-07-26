package automacao.core;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automacao.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
    private static String nomeCenario;
    private static File diretorio;
    private static int numPrint;
	private static WebDriver driver;
	private static WebDriverWait wait;

	public Driver(Browser navegador) {
		switch (navegador) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case IE:
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void visibilityOf(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void invisibilityOf(WebElement element) {
			wait.until(ExpectedConditions.invisibilityOf(element));
	}

    public static void atributeChange(WebElement element, String atribute, String value){
        wait.until(ExpectedConditions.attributeContains(element, atribute, value));
    }
    
    public static void printScreen(String passo) throws IOException {
        numPrint++;
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String caminho = diretorio.getPath() + "/" + numPrint + " - " + passo + ".png";

        FileUtils.copyFile(file, new File(caminho));
    }
    
    
    }
		