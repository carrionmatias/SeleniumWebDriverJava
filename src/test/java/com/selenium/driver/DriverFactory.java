package com.selenium.driver;

import java.util.concurrent.TimeUnit;
import Metodosutiles.Utiles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;


	public class DriverFactory {
		private enum browsers {
		 FIREFOX, CHROME
	};
	//public static WebDriver LevantarBrowser(WebDriver driver, ITestContext context )
	
	public static WebDriver LevantarBrowser(WebDriver driver, ITestContext context )
	{  
		String browserName = context.getCurrentXmlTest().getParameter(
		"Navegador");
		
		String pagina= context.getCurrentXmlTest().getParameter("Url");
		
		
		switch (browsers.valueOf(browserName)) {
		case CHROME: // Using WebDriver
			
		{
			//////cierra notificaciones del navegador VERO
			ChromeOptions notificaciones = new ChromeOptions();
			notificaciones.addArguments("--disable-notifications");
			notificaciones.addArguments("--disable-extensions");
			System.setProperty("webdriver.chrome.driver", "src\\Recursos\\drivers\\chromedriver.exe");
			Utiles.reportes("Abro browser");
			driver = new ChromeDriver(notificaciones);///llama al cierre de notificaciones /VERO
			break;
		}
		case FIREFOX:// Using WebDriver
		{
			System.setProperty("webdriver.gecko.driver", "src\\Recursos\\drivers\\geckodriver.exe");
			Utiles.reportes("Abro browser");
			driver = new FirefoxDriver();
			break;
		}
		default:
			Utiles.reportes("No selecciono ningun browser correcto, se le asignara Chrome");
			System.setProperty("webdriver.chrome.driver", "src\\Recursos\\drivers\\chromedriver.exe");
			Utiles.reportes("Abro browser");
			driver = new ChromeDriver();
			break;

		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pagina);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;

	}
	
	public static void FinalizarBrowser(WebDriver driver) {
		Utiles.reportes("Cerrando el browser");
		driver.quit();
		driver = null;
	}
}