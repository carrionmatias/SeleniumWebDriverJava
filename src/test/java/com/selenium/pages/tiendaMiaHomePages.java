package com.selenium.pages;


import org.openqa.selenium.By;

import java.util.List;					  

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import Metodosutiles.Utiles;

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
	    
	  

	// Definimos los webElement en una clase publlica para prevenir que en un futuro
	// cambie el localizador																				 
	  //SELECTOR CAJA DE BUSQUEDA TIENDA MIA 

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
	

	// Selector es el boton lupa
	@FindBy(id = "search-lupa")
	private WebElement searchlupa;
	// Selector boton ordenar por:
	@FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]")

	private WebElement OrdenarPor;
	@FindBy(xpath = "//body/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[2]/select[1]")
	private Select ListaOrdenarPor;

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

	
	private WebElement ordenarPor;
	///////LOCALIZADORES DE TIENDAS
	// Selector Boton Tienda Ebay
	@FindBy(id = "ebay-tab")
	private WebElement ebayButtom;
	// Selector Boton Tienda mcy
	@FindBy(id = "mcy-tab")
	private WebElement mcyButtom;
	///////LOCALIZADORES POR TODAS LAS CATEGORIAS
	// Selector todas las categorias
	@FindBy(className = "menu-categories")
	private WebElement categoriasDropDawn;
	// Selector Categoria calzado
	@FindBy(className = "menu-categories")
	private List<WebElement> todasLasCategoriasDropDawn;
	//Selector Categoria calzado
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[9]")
	private WebElement calzadosButtom;
	//Selector Categoria Deportivo
	@FindBy(xpath = "//a[@href='https://tiendamia.com/ar/categorias?amzc=deportivo-hombre']")
	private WebElement deportivoButtom;
		// ***** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH							 
	    @FindBy(name = "amz")
	    private WebElement cajadebusqueda2;


	

	// ***** IDENTIFICAMOS LOS ELEMENTOS POR SU LOCATOR EJEMPLO ID O XPATH

	
	public void ingresarDatoCajaBusqueda ( String dato){

		Reporter.log("Ingresar la palabra " + dato);
		searchgoogle.sendKeys(dato);
		Reporter.log("Presionar Enter");
		searchgoogle.sendKeys(Keys.ENTER);

		// searchgoogle.submit();
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


	public boolean validarBotonIngresar1() {
		Reporter.log("Localizar y comprobar que el boton Entar exista");
		return entrarButton.isDisplayed();
	}

	public void ingresarCorreo(String dato) {
		Reporter.log("Se ingresa la direccion de correo " + dato);
		email.sendKeys(dato);
	}

	public boolean validarCorreo (){
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
	
	////////////////////////////////// MATIAS////////////////////////////////
	public void clickCajadeBusqueda2() {
		Reporter.log("Se oreciona ENTER en la caja de busqueda ");
		cajadebusqueda2.sendKeys(Keys.ENTER);
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
/////////////////////////CODIGO vero/NAVEGACION/selectores///////////
	
@FindBy(xpath = "//a[@class='solo_ar']//span[contains(text(),'Ofertas')]")
public WebElement Ofertas;
@FindBy(xpath = "//div[@class='menu-categories']")
public WebElement menuCategorias ;
@FindBy(xpath = "(//a[@id='como_comprar_light'])[1]")
public WebElement comoComprar;
@FindBy(xpath ="(//button[@class='close modal-como-comprar'])[1]")
public WebElement closeModalComprar;


/////////////fin de navegacion///////////
	
////////////vero/metodos////////////


public void ingresarOfertas() {
	Reporter.log("Se busca el button Ofertas");
	Actions actions = new Actions(driver);
	actions.moveToElement(Ofertas).click();
}
public boolean validarOfertas() {
	Reporter.log("Localizar y comprobar que el boton Ofertas exista");
	return Ofertas.isDisplayed();
}
	
public void ingresarComprar() {
	Reporter.log("Se busca el button comprar");
	Actions actions = new Actions(driver);
	actions.moveToElement(comoComprar).click();
}
	public boolean validarCompras() {
		Reporter.log("Localizar que el button Compras exista");
		return comoComprar.isDisplayed();
	}
	public void listaMenuCategoria() {
		Reporter.log("Se busca menu Categoria");
		Actions actions = new Actions(driver);
		actions.moveToElement(menuCategorias).click().perform();
	}
	public boolean validarMenuCategorias() {
		Reporter.log("Localizar y comprobar que el menu Categoria exista");
		return menuCategorias.isDisplayed();
	}
	public void validarPopupComprar() {
		Reporter.log("Utilizar Actions para hacer clic en el enlace");
		Actions actions = new Actions(driver);
		actions.moveToElement(closeModalComprar).click().perform();
	}
	public boolean cerrarPopupComprar() {
		Reporter.log("Localizar y comprobar que el modal exista");
		return closeModalComprar.isDisplayed();
	}
	public void listas() {
		Reporter.log(" Despliegue de la lista del Menu Categoria");
		Assert.assertTrue(validarMenuCategorias()," Validar que el menu Categoria se vizualice");
		List<WebElement> opciones = driver.findElements(By.xpath ("(//ul[@id='categories-dropdown'])[1]")); 
		/////ciclo for hace una repeticion en todos los elementos
		for (WebElement opcion:opciones) {
			System.out.println(opcion.getText());
			/////////el if es la respuesta de si encuentra tal cosa hace esto 
			if(opcion.getText().contains("Ropa y Accesorios")) {
				opcion.click();
				break;//////para donde se le indica y no sigue haciendo el ciclo
				
			}
		}
	}
	
	
	

///////////////////////////////////////////////////////////////////////////

		
	
	   public void seleccionarOpcion(String opcion) {
	        // Hacer clic en el elemento principal para activar el menú desplegable
	        ordenarPor.click();

	        // Utilizar un objeto Select para interactuar con el elemento <select>
	        Select select = new Select(ordenarPor);

	        // Seleccionar la opción deseada por su texto visible
	        select.selectByVisibleText(opcion);
	    }	
	
//Metodos para busqueda por tienda, amazon viene por defecto
	   
		
		public void clickBottonTiendaEbay() {
			Reporter.log("Hacemos click en el enlace");
			ebayButtom.click();
		}

		public boolean validarBottonTiendaEbay() {
			Reporter.log("Se visualiza el elemento lupa");
			return ebayButtom.isDisplayed();
		}

		public void clickBottonTiendaMcy() {
			Reporter.log("Hacemos click en el enlace");
			mcyButtom.click();
		}

		public boolean validarBottonTiendaMcy() {
			Reporter.log("Se visualiza el elemento lupa");
			return mcyButtom.isDisplayed();
		}

/////Metodos para Ordenar productos
		
		public void clickBotonCategorias() {
			Reporter.log("Se busca el boton de Todas Las Categorias");
			Actions actions = new Actions(driver);
			actions.moveToElement(categoriasDropDawn).click().build().perform();
		}

		public boolean validarBotonCategorias() {
			Reporter.log("Localizar y comprobar que el boton Todas Las Categorias funcione");
			return categoriasDropDawn.isDisplayed();
		}
		
		
		public void seleccionarListaCalzado() {
			Reporter.log("Se busca el boton de Categoria Deportivo");
			Actions actions = new Actions(driver);
			actions.moveToElement(calzadosButtom).perform();
		}
		public void seleccionarListaDeportivo() throws InterruptedException {
			Reporter.log("Se busca el boton de Categoria Deportivo");
			Actions actions = new Actions(driver);
			Thread.sleep(1000);
			actions.moveToElement(deportivoButtom).click().build().perform();
		}


}												   

