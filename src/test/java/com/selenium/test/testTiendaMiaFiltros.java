package com.selenium.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import com.selenium.pages.tiendaMiaHomePages;
import Metodosutiles.Utiles;

public class testTiendaMiaFiltros {

	WebDriver driver;

	@BeforeMethod()
	public void Precondicion(ITestContext context) {
		// Abrimos el navegador
		
		Utiles.reportes("Se abre Navegador");
		driver =DriverFactory.LevantarBrowser(driver,context);
	}

	@AfterMethod()
	public void postcondiciones() throws Exception {
		// Cerramos el navegador
		Utiles.reportes("Se cierra el navegador");
		DriverFactory.FinalizarBrowser(driver);
		}
	
	@Test(description = "Validar que las busquedas en Wikipedia funcionan")
	public void ValidarBusquedaWikipedia() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		Thread.sleep(2000);
		Assert.assertTrue(homepage.validarPopup1Exista(),"El popap1 no aparece");
		homepage.cerrarPopup1();
		
		Thread.sleep(3000);
		
		
		
	
	}	
	
	

}
