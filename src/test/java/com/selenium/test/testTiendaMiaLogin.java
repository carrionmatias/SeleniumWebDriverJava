package com.selenium.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.driver.DriverFactory;
import com.selenium.pages.tiendaMiaHomePages;

import Metodosutiles.Utiles;

public class testTiendaMiaLogin {
	
	WebDriver driver ;
	@BeforeMethod()
	public void Precondicion(ITestContext context) {
	//Abrimos chrome
		Utiles.reportes("Se abre navegador navegador");
		driver =DriverFactory.LevantarBrowser(driver,context);
		//driver =drivers.conectar();
	//maximizamos la ventana
		Utiles.reportes("Se maximiza la ventana");
		driver.manage().window().maximize();

	}
	@AfterMethod() 
	public void postcondition()throws Exception {
		//Cerramos chrome
//		Utiles.reportes("Se cierra navegador");
//		driver.close();
		
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
	
	//////////////////////////////////LOGIN/////////////////////////////////
	// Buscamos el elemento de login y verificamos que se visualice
	Utiles.reportes("se busca el elemento login");
	WebElement micuentaButton = driver.findElement(By.className("login-a"));
	Utiles.reportes("se visualiza el elemento login");
	Assert.assertTrue(micuentaButton.isDisplayed());
	//Utilizar Actions para hacer clic en el enlace
	Utiles.reportes("Utilizar Actions para hacer clic en el enlace");
	Actions actions3 = new Actions(driver);
	actions3.moveToElement(micuentaButton).click().build().perform();
//Buscamos el boton de entar y verificamos que se visualice
	Utiles.reportes("Sebusca el boton de entrar");
	WebElement entrarButton=driver.findElement(By.className("lg_button"));
	Utiles.reportes("se visualiza el elemento boton entrar");
	Assert.assertTrue(entrarButton.isDisplayed());
//Utilizar Actions para hacer clic en el enlace
	Utiles.reportes("Utilizar Actions para hacer clic en el enlace");
	Actions actions4 = new Actions(driver);
	actions4.moveToElement(entrarButton).click().build().perform();
	
//Buscamos el elemento email y verificamos que se visualice
	Thread.sleep(3000);
	Utiles.reportes("se busca el elemento email");
	WebElement email=driver.findElement(By.xpath("//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/input[1]"));
	Utiles.reportes("se visualiza el elemento elemento email");
	Assert.assertTrue(email.isDisplayed());
//Al elemento email le typeamos la direccion de correo
	Utiles.reportes("Se ingresa la direccion de correo");
	email.sendKeys("correoparapruebasautomatizadas@gmail.com");
//Buscamos el elemento contraseña y verificamos que se visualice
	Thread.sleep(3000);
	Utiles.reportes("se busca el elemento contraseña");
	WebElement password=driver.findElement(By.id("password-log"));
	Utiles.reportes("se visualiza el elemento elemento email");
	Assert.assertTrue(password.isDisplayed());
//Al elemento email le typeamos la direccion de correo
	Utiles.reportes("Se ingresa la direccion de correo");
	password.sendKeys("Testing.automation");

	//Buscamos el boton ingresar
	Utiles.reportes("se busca el boton ingrasar");
	WebElement ingresarbutton=driver.findElement(By.id("login-button"));
	Utiles.reportes("se visualiza el elemento boton ingresar");
	Assert.assertTrue(ingresarbutton.isDisplayed());
	//Hacemos click en el boton ingresar
	ingresarbutton.click();
	Thread.sleep(5000);	
		
	}

}
