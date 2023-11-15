package com.selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class tiendaMiaHomePages {
	WebDriver driver;

	public tiendaMiaHomePages(WebDriver ldriver) {
		driver = ldriver;
	
	}
	//Definimos los webElement en una clase publlica para prevenir que en un futuro cambie el localizador
	
	   //ENTRA A LA CAJA DE BUSQUEDA DE GOOGLE    
	   @FindBy(id = "APjFqb")
	    private WebElement searchgoogle;
	   
       //SELECCIONAMOS EL 3ER ELEMENTO DE GOOGLE
	    @FindBy(xpath = "//h3[contains(text(),'Comprar en USA desde tu hogar - tiendamia.com')]")
	    private WebElement firstResultLink;
        
	    //SELECCIONA EL ELEMENTO ARGENTINA
	    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div[2]/div[1]/a")
	    private WebElement SecondResultLink;
        
	    //PRIMERA PUBLICIDAD
	    @FindBy(xpath = "//body/div[2]/div[18]/div[1]/div[1]/a[1]")
	    private WebElement popupButton;
 
	    //SEGUNDA PUBLICIDAD
	    @FindBy(xpath = "//body/div[2]/div[22]/div[2]/button[1]")
	    private WebElement popup3Button;
 
	    //LOCALIZADORES LOGIN//
	    
	  //SELECTOR EN EL BOTON DE MI CUENTA PARA INGRESAR
	    @FindBy(className = "login-a")
	    private WebElement micuentaButton;

	  //SELECTOR EN EL BOTON ROJO DE LA LISTA DESPLEGADA
	    @FindBy(className = "lg_button")
	    private WebElement entrarButton;
  
	  //SELECTOR EL ELEMENTO EMAIL
	    @FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/input[1]")
	    private WebElement email;

	  //SELECTOR ELEMENTO PASWORD
	    @FindBy(id = "password-log")
	    private WebElement password;

	  //SELECTOR BOTON ROJO INGRESAR
	    @FindBy(id = "login-button")
	    private WebElement ingresarbutton;

	  //SELECTOR CAJA DE BUSQUEDA TIENDA MIA 
	    @FindBy(name = "amz")
	    private WebElement cajadebusqueda2;

	  //SELECTOR EN EL BOTON LUPA
	    @FindBy(id = "search-lupa")
	    private WebElement searchlupa;

	

	// ***** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH

	
	public void ingresarDatoCajaBusqueda ( String dato){
		Reporter.log("Ingresar la palabra " + dato);
		searchgoogle.sendKeys(dato);
		Reporter.log("Presionar Enter");
		searchgoogle.sendKeys(Keys.ENTER);
		//searchgoogle.submit();
	}
	
	public boolean validarCajaTextoExista (){
		Reporter.log("Localizar y comprobar que la caja de busqueda se muestra");
		return searchgoogle.isDisplayed();
	}
	
	//ENTRA AL 3ER ELEMENTO H3 DE GOOGLE
	public void ingresarTercerElemento (){
		Reporter.log("Hacemos click en el enlace");
		firstResultLink.click();
	}
	//ENTRA A LA BANDERA ARGENTINA
	public void ingresarPais ( ){
		Reporter.log("Hacemos click en el elemento Argentina");
		SecondResultLink.click();
	}
	//////////////////////////////////CIERRE PUBLICIDAD/////////////////////////////////
	
	public void cerrarPopup1 (){
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(popupButton).click().build().perform();
	}
	
	public boolean validarPopup1Exista (){
		Reporter.log("Localizar y comprobar que el elemento popup1 exista");
		return popupButton.isDisplayed();
	}

	public void Cerrarpopup2 (){
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(popup3Button).click().build().perform();
	}
	
	public boolean validarPopup3Exista (){
		Reporter.log("Localizar y comprobar que el elemento popup2 exista");
		return popup3Button.isDisplayed();
	}
	//////////////////////////////////LOGIN CRISTIAN/////////////////////////////////

	public void buscarBotonMiCuenta (){
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(micuentaButton).click().build().perform();
	}
	
	public boolean validarBotonMiCuenta (){
		Reporter.log("Localizar y comprobar que el boton Mi Cuenta exista");
		return micuentaButton.isDisplayed();
	}
	
	public void ingresaraMiCuenta (){
		Reporter.log("Sebusca el boton de entrar");
		Actions actions = new Actions(driver);
		actions.moveToElement(entrarButton).click().build().perform();
	}
	
	public boolean validarBotonIngresar1 (){
		Reporter.log("Localizar y comprobar que el boton Entar exista");
		return entrarButton.isDisplayed();
	}
	
	public void ingresarCorreo ( String dato){
		Reporter.log("Se ingresa la direccion de correo " + dato);
		email.sendKeys(dato);
	}
	public boolean validarCorreo (){
		Reporter.log("Se visualiza el elemento elemento email");
		return email.isDisplayed();
	}

	public void ingresarPassword ( String dato){
		Reporter.log("Se ingresa password " + dato);
		password.sendKeys(dato);
	}
	public boolean validarPassword (){
		Reporter.log("Se visualiza el elemento elemento password");
		return password.isDisplayed();
	}
	
	public void presionarBotonIngresar ( ){
		Reporter.log("Se ingresa la direccion de correo ");
		ingresarbutton.click();
	}
	public boolean validarBotonIngresar2 (){
		Reporter.log("Se visualiza el elemento boton ingresa");
		return ingresarbutton.isDisplayed();
	}
	//////////////////////////////////BUSQUEDA/////////////////////////////////
	
	public void ingresarCajadeBusqueda2 ( String dato){
		Reporter.log("Se tipea la palabra " + dato);
		cajadebusqueda2.sendKeys(dato);
	}

	public boolean validarCajaDeBusqueda2 (){
		Reporter.log("Se visualiza el elemento boton ingresa");
		return cajadebusqueda2.isDisplayed();
	}
	
	public void presionarLupa ( ){
		Reporter.log("Hacemos click en lupa");
		searchlupa.click();
	}

	public boolean validarElementoSearchlupa (){
		Reporter.log("Verificamos que elemento se visualice");
		return searchlupa.isDisplayed();
	}
	
	
	
}
