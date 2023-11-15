package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class tiendaMiaHomePages {
	WebDriver driver;

	public tiendaMiaHomePages(WebDriver ldriver) {
		driver = ldriver;

	}

	// Definimos los webElement en una clase publlica para prevenir que en un futuro
	// cambie el localizador
	// ENTRA A LA CAJA DE BUSQUEDA DE GOOGLE
	@FindBy(id = "APjFqb")
	private WebElement searchgoogle;
	// Selector el 3er elemento(h3) de google
	@FindBy(xpath = "//h3[contains(text(),'Comprar en USA desde tu hogar - tiendamia.com')]")
	private WebElement firstResultLink;
	//// Selector elemento Argentina
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[1]/a")
	private WebElement SecondResultLink;
	// Selector PRIMERA PUBLICIDAD
	@FindBy(xpath = "//body/div[2]/div[18]/div[1]/div[1]/a[1]")
	private WebElement popup1Button;
	// Selector SEGUNDA PUBLICIDAD
	@FindBy(xpath = "//body/div[2]/div[22]/div[2]/button[1]")
	private WebElement popup2Button;
	// Selector
	///////// localizadore de CRISTIAN////////
	// Selector es el boton de mi cuenta para ingresar
	@FindBy(className = "login-a")
	public WebElement micuentaButton;
	// Selector es el boton rojo de la lista desplegada
	@FindBy(className = "lg_button")
	public WebElement entrarButton;
	// Selector es el elemento e-mail
	@FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/input[1]")
	private WebElement email;
	// Selector es elemento password
	@FindBy(id = "password-log")
	private WebElement password;
	// Selector es el boton rojo ingresar
	@FindBy(id = "login-button")
	private WebElement ingresarbutton;
	// Selector caja de busqueda tienda mia
	@FindBy(name = "amz")
	private WebElement cajadebusqueda2;
	// Selector es el boton lupa
	@FindBy(id = "search-lupa")
	private WebElement searchlupa;
	// Selector boton ordenar por:
	@FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]")
	private WebElement OrdenarPor;
	@FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]")
	private Select ListaOrdenarPor;
/////////////////////////vero///////////
	
	@FindBy(xpath = "//a[@class='solo_ar']//span[contains(text(),'Ofertas')]")
	public WebElement Ofertas;
	@FindBy(xpath = "//div[@class='menu-categories']")
	public WebElement menuCategorias ;
	
	// Selector ordenar por:Promocionados
	@FindBy(xpath = "//option[contains(text(),'Promocionados')]")
	private WebElement OrdenarPorPromocionados;
	// Selector ordenar por:Precio: Menor a mayor
	@FindBy(css = "'option[data-url=\"?&navigation_amz=L3M/az1jYW1pc2ErYXp1bCZzPXByaWNlLWFzYy1yYW5rJmRjJmxhbmd1YWdlPWVuJnFpZD0xNjk5OTQwNjIzJnJlZj1zcl9zdF9wcmljZS1hc2MtcmFuayZkcz12MSUzQXhLYXlVSldMY0klMkJGNXlYOWk3eVN6dW51S1plWk5VaE1kQ1clMkJETW1pWHpv\"][data-vendorid=\"amz\"].js-sorter-item'")
	private WebElement OrdenarPorMenoraMayor;
	// Selector ordenar por:Precio: Mayor a menor
	@FindBy(xpath = "//option[contains(text(),'Precio: Mayor a menor')]")
	private WebElement OrdenarPorMayoraMenor;
	// Selector ordenar por:Mejor puntuados
	@FindBy(xpath = "//option[contains(text(),'Mejor puntuados')]")
	private WebElement OrdenarPorMejorPuntuados;
	// Selector ordenar por:Recién arribados
	@FindBy(xpath = "//option[contains(text(),'Recién arribados')]")
	private WebElement OrdenarPorRecienArribados;
	// Selector ordenar por:Mas Vendidos
	@FindBy(xpath = "//option[contains(text(),'Mas Vendidos')]")
	private WebElement OrdenarPorMasVendidos;


	
	// *** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH

	public void ingresarDatoCajaBusqueda(String dato) {
		Reporter.log("Ingresar la palabra " + dato);
		searchgoogle.sendKeys(dato);
		Reporter.log("Presionar Enter");
		searchgoogle.sendKeys(Keys.ENTER);
		// searchgoogle.submit();
	}

	public boolean validarCajaTextoExista() {
		Reporter.log("Localizar y comprobar que la caja de busqueda se muestra");
		return searchgoogle.isDisplayed();
	}

	// entra el 3er elemento(h3) de google
	public void ingresarTercerElemento() {
		Reporter.log("Hacemos click en el enlace");
		firstResultLink.click();
	}

	// entra a la bandera Argentina
	public void ingresarPais() {
		Reporter.log("Hacemos click en el elemento Argentina");
		SecondResultLink.click();
	}
	////////////////////////////////// CIERRE
	////////////////////////////////// PUBLICIDAD/////////////////////////////////

	public void cerrarPopup1() {
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(popup1Button).click().build().perform();
	}

	public boolean validarPopup1Exista() {
		Reporter.log("Localizar y comprobar que el elemento popup1 exista");
		return popup1Button.isDisplayed();
	}

	public void Cerrarpopup2() {
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(popup2Button).click().build().perform();
	}

	public boolean validarPopup2Exista() {
		Reporter.log("Localizar y comprobar que el elemento popup2 exista");
		return popup2Button.isDisplayed();
	}
	////////////////////////////////// LOGIN
	////////////////////////////////// CRISTIAN/////////////////////////////////

	public void buscarBotonMiCuenta() {
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(micuentaButton).click().build().perform();
	}

	public boolean validarBotonMiCuenta() {
		Reporter.log("Localizar y comprobar que el boton Mi Cuenta exista");
		return micuentaButton.isDisplayed();
	}

	public void ingresaraMiCuenta() {
		Reporter.log("Sebusca el boton de entrar");
		Actions actions = new Actions(driver);
		actions.moveToElement(entrarButton).click().build().perform();
	}

	public boolean validarBotonIngresar1() {
		Reporter.log("Localizar y comprobar que el boton Entar exista");
		return entrarButton.isDisplayed();
	}

	public void ingresarCorreo(String dato) {
		Reporter.log("Se ingresa la direccion de correo " + dato);
		email.sendKeys(dato);
	}

	public boolean validarCorreo() {
		Reporter.log("Se visualiza el elemento elemento email");
		return email.isDisplayed();
	}

	public void ingresarPassword(String dato) {
		Reporter.log("Se ingresa password " + dato);
		password.sendKeys(dato);
	}

	public boolean validarPassword() {
		Reporter.log("Se visualiza el elemento elemento password");
		return password.isDisplayed();
	}

	public void presionarBotonIngresar() {
		Reporter.log("Se ingresa la direccion de correo ");
		ingresarbutton.click();
	}

	public boolean validarBotonIngresar2() {
		Reporter.log("Se visualiza el elemento boton ingresa");
		return ingresarbutton.isDisplayed();
		
	}
	////////////////////////////////// BUSQUEDA METODOS CARRION
	////////////////////////////////// MATIAS/////////////////////////////////

	public void ingresarCajadeBusqueda2(String dato) {
		Reporter.log("Se tipea la palabra " + dato);
		cajadebusqueda2.sendKeys(dato);
	}

	public void clickCajadeBusqueda2() {
		Reporter.log("Se oreciona ENTER en la caja de busqueda ");
		cajadebusqueda2.sendKeys(Keys.ENTER);
	}

	public boolean validarCajaDeBusqueda2() {
		Reporter.log("Se visualiza el elemento boton ingresa");
		return cajadebusqueda2.isDisplayed();
	}

	public void presionarLupa() {
		Reporter.log("Se clicklea el elemento lupa ");
		searchlupa.submit();
	}

	public boolean validarElementoSearchlupa() {
		Reporter.log("Se visualiza el elemento lupa");
		return searchlupa.isDisplayed();
	}
//Metodos para Ordenar productos
	
	public void BotonOrdenarPor() {
		Reporter.log("Sebusca el boton de Ordenar Por:");
		Actions actions = new Actions(driver);
		actions.moveToElement(OrdenarPor).click().build().perform();
	}

	public boolean validarBotonOrdenarPor() {
		Reporter.log("Localizar y comprobar que el boton Ordenar Por: funcione");
		return OrdenarPor.isDisplayed();
	}
	public void OrdenarPorPromocionados() {
		Reporter.log("Sebusca el boton de Ordenar Por:");
		Actions actions = new Actions(driver);
		actions.moveToElement(OrdenarPorPromocionados).click().build().perform();
	}

	public boolean validarOrdenarPorPromocionados() {
		Reporter.log("Localizar y comprobar que el boton Ordenar Por: funcione");
		return OrdenarPorPromocionados.isDisplayed();
	}
	public void OrdenarPorMenoraMayor() {
		Reporter.log("Sebusca Ordenar Por Menor a Mayor");
		Actions actions = new Actions(driver);
		actions.moveToElement(OrdenarPorMenoraMayor).click().build().perform();
	}

	public boolean validarOrdenarPorMenoraMayor() {
		Reporter.log("Localizar y comprobar que el boton Ordenar Por Menor a Mayor funcione");
		return OrdenarPorMenoraMayor.isDisplayed();
	}

	public String ListaOrdenada() {
		Select selectList = ListaOrdenarPor ;
		selectList.selectByVisibleText("Promocionados");
		return getText(selectList.getFirstSelectedOption());
	}

	private String getText(WebElement firstSelectedOption) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ingresarOfertas() {
		Reporter.log("Sebusca el boton de entrar");
		Actions actions = new Actions(driver);
		actions.moveToElement(Ofertas).click();
	}
	public boolean validarOfertas() {
		Reporter.log("Localizar y comprobar que el boton Entar exista");
		return Ofertas.isDisplayed();
	}
	public boolean validarMenuCategorias() {
		Reporter.log("Localizar y comprobar que el boton Ordenar Por: funcione");
		return menuCategorias.isDisplayed();
	}
	public void listaMenuCategoria() {
		Reporter.log("Sebusca Ordenar Por Menor a Mayor");
		Actions actions = new Actions(driver);
		actions.moveToElement(menuCategorias).click().perform();
	}
	}

