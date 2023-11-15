package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.selenium.driver.DriverFactory;
import com.selenium.pages.tiendaMiaHomePages;
import Metodosutiles.Utiles;

public class testTiendaMiaNavegacion {
	WebDriver driver;

	@BeforeMethod()
	public void Precondicion(ITestContext context) {
		// Abrimos el navegador
		
		
		driver =DriverFactory.LevantarBrowser(driver,context);
		
	}

	@AfterMethod()
	public void postcondiciones() throws Exception {
		// Cerramos el navegador
		
		DriverFactory.FinalizarBrowser(driver);
		}
	
	
	@Test( description = "Validar que las busquedas en Tienda Mia funcionan")
	public void ValidarBusquedaTiendaMia() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		Utiles.ThreadSleep2seg();// esperas
		Assert.assertTrue(homepage.validarPopup1Exista(),"El popup1 aparece");
		Utiles.reportes("Se cierra el pop-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		Utiles.reportes("Se verifica el elemento Pou-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El popup2 aparece");
		Utiles.reportes("Se cierra el pop-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		Utiles.reportes("Verificar que el menu Categoria exista");
		Assert.assertTrue(homepage.validarMenuCategorias()," Validar que el menu Categoria existe");
		Utiles.ThreadSleep2seg();
		homepage.listaMenuCategoria();
		Utiles.threadSleep5seg();
		Utiles.reportes("Verificar que el button Ofertas exista");
		Assert.assertTrue(homepage.validarOfertas()," Validar que Button Ofertas existe");
		homepage.Ofertas.click();
		Utiles.ThreadSleep2seg();
		driver.navigate().back();
		Utiles.reportes("Verificar que el boton mi cuenta exista");
		Assert.assertTrue(homepage.validarBotonMiCuenta()," Buttton cuenta existe");
		Utiles.ThreadSleep2seg();
		homepage.micuentaButton.click();
		Utiles.reportes("Entrar Button rojo");
		Assert.assertTrue(homepage.validarBotonIngresar1(),"Entrar");
		homepage.entrarButton.click();
		Utiles.ThreadSleep2seg();
		driver.navigate().back();
		Utiles.reportes("Verificar que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(),"La caja de busqueda se vizualiza");
		Utiles.ThreadSleep2seg();
		Utiles.reportes("En la caja de busqueda Lavarropa");
		homepage.ingresarCajadeBusqueda2("Lavarropa");
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();
		
		
		
	}
}


