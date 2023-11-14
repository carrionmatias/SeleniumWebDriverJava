package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Metodosutiles.Utiles;

public class wikiHomePages {
	
	 @FindBy(id="searchInput")
	private WebElement searchInput;
	 public void verificarCajadeBusquedaexista() {
	// Verificamos que el elemento se visualice
			Utiles.reportes("La caja de busqueda fue visualizada");
			Assert.assertTrue(searchInput.isDisplayed());
	 }
	 public void EnviarDatos(String datos) {
		 searchInput.sendKeys(datos);
			// Hacemos enter en la caja de busqueda
			Utiles.reportes("Se presiona enter");
			//searchInput.sendKeys(Keys.ENTER);
			searchInput.submit();
	 }
}