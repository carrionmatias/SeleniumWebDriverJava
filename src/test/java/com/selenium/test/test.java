package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import Metodosutiles.Utiles;
import com.selenium.pages.wikiHomePages;
import com.selenium.pages.wikiResultPage;




public class test {
	WebDriver driver;

	@BeforeMethod()
	public void Precondicion(ITestContext context) {
		// Abrimos el navegador
		
		Utiles.reportes("Se abre Navegador");
		driver =DriverFactory.LevantarBrowser(driver,context);
		Utiles.reportes("Ingresar a Wikipedia.org");
		driver.get("http://wikipedia.org");
	}

	@AfterMethod()
	public void postcondiciones() throws Exception {
		// Cerramos el navegador
		Utiles.reportes("Se cierra el navegador");
		DriverFactory.FinalizarBrowser(driver);
		}
	

	@DataProvider(name = "datos")
	public Object[][] createData() {
		return new Object[][] { 
			{ "LIONEL MESSI", "Lionel Messi" }, 
			{ "BUENOS AIRES", "Buenos Aires" },
			{ "BRUJA", "Bruja" }, 
			{ "CHACO", "Chaco" },

		};

	}

	@DataProvider(name = "datosDos")
	public Object[][] createDataDos() {
		return new Object[][] { 
			{ "SAN LUIS", "San Luis" ,"SAMSUNG","Samsung"},
			//{"EL REY LEON", "El Rey Leon"},
			 

		};

	}

	@Test(dataProvider = "datos", description = "Validar que las busquedas en Wikipedia funcionan")
	public void ValidarBusquedaWikipedia(String varBuscar, String varResultado) throws Exception {
		wikiHomePages homepage=PageFactory.initElements(driver,wikiHomePages.class);
		homepage.verificarCajadeBusquedaexista();
		// En la caja de busqueda tipeamos
		Utiles.reportes("Se tipea la palabra" + varBuscar);
		// Hacemos enter en la caja de busqueda
		homepage.EnviarDatos(varBuscar);
		Thread.sleep(2000);// esperas
		// Identificamos el elemento de la pagina resultado
	wikiResultPage resultadopage=PageFactory.initElements(driver,wikiResultPage.class);	
	resultadopage.ValidadTitulo(varResultado);	
	}
}

//	@Test(dataProvider = "datosDos", description = "Verificar que se realice dos busqueda")
//	public void verficarDobleBusqueda(String varBuscar, String varResultado, String varBuscarDos,String varResultadoDos) 
//			throws Exception {
//		// Buscamos el elemento SearchInput
//		Utiles.reportes("Ir a la caja de busqueda");
//		WebElement searchInput = driver.findElement(By.id("searchInput"));
//		// Verificamos que el elemnto se visualice
//		Utiles.reportes("La caja de busqueda fue visualizada");
//		Assert.assertTrue(searchInput.isDisplayed());
//		// En la caja de busqueda tipeamos Argentina
//		Utiles.reportes("Se tipea la palabra" + varBuscar);
//		searchInput.sendKeys(varBuscar);
//		// Hacemos enter en la caja de busqueda
//		Utiles.reportes("Se presiona enter");
//		searchInput.submit();
//		Thread.sleep(2000);// esperas
//		WebElement titulolabel = driver.findElement(By.id("firstHeading"));
//		Assert.assertTrue(titulolabel.getText().contains(varResultado), " No se encontro la palabra");
//		WebElement cajadebusqueda = driver.findElement(By.xpath("//input[@id='searchInput']"));
//		Assert.assertTrue(cajadebusqueda.isDisplayed(), " No se encontro la palabra");
//		cajadebusqueda.sendKeys(varBuscarDos);
//		//cajadebusqueda.sendKeys(Keys.ENTER);
//		cajadebusqueda.submit();
//		Thread.sleep(2000);
//		titulolabel = driver.findElement(By.id("firstHeading"));
//		Assert.assertTrue(titulolabel.getText().contains(varResultadoDos), " No se encontro la palabra");
//
//	}
//
//}
//
//
