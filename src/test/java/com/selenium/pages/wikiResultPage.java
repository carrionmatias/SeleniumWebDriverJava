package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Metodosutiles.Utiles;

public class wikiResultPage {
	@FindBy (id="firstHeading")
	private WebElement tituloResultado;
	public void ValidadTitulo(String varResultado) {
	
	// Verificamos que el titulo se muestre
	Utiles.reportes("Se muestra el titulo");
	Assert.assertTrue(tituloResultado.isDisplayed());
	Assert.assertTrue(tituloResultado.getText().contains(varResultado));
}
}