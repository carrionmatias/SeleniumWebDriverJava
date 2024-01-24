package com.selenium.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.driver.DriverFactory;
import com.selenium.pages.tiendaMiaHomePages;

import AccesoADato.ExcelUtils;
import Metodosutiles.Utiles;

public class testTiendaMiaBusqueda {
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

	@DataProvider (name = "DatosNuevos")
	public Object[][] DatosNuevos() throws Exception{

	String excelPath= "C:\\TestData.xlsx";
	String hoja="Sheet1";
	ExcelUtils.setExcelFile(excelPath,hoja);
	int iTestCaseRow = ExcelUtils.getRowUsed();
	Object[][] testObjArray = ExcelUtils.getTableArray(excelPath,hoja,iTestCaseRow,2);

	return (testObjArray);
	}
	
	@Test(dataProvider = "DatosNuevos", description = "Tipear y buscar exitosamente prodcutos desde un archivo .xlsx")
	public void BusquedaTiendaMia(String varbuscar) throws Exception {

	
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		Utiles.reportes("Se abre navegador");		
		Utiles.ThreadSleep2seg();
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up2 exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra  "  + varbuscar);
		homepage.ingresarCajadeBusqueda2(varbuscar);
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();
	
		

	}


		@Test(description = "Búsqueda con Filtro Ordenado por: Promocionados")
		public void BuscarPorFiltroPromocionado() throws Exception {
			tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
			
			Utiles.ThreadSleep2seg();
			
			Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
			Utiles.reportes("Se cierra pup-up");
			homepage.cerrarPopup1();
			Utiles.threadSleep5seg();
			
			Utiles.reportes("Se verifica el elemento Pup-up exista");
			Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
			Utiles.reportes("Se cierra pup-up");
			homepage.Cerrarpopup2();
			Utiles.ThreadSleep2seg();
			
			Utiles.reportes("Se verifica que la caja de busqueda exista");
			Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
			Utiles.ThreadSleep2seg();
			
			Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
			homepage.ingresarCajadeBusqueda2("Camisa Azul");
			Utiles.ThreadSleep2seg();
			homepage.clickCajadeBusqueda2();
			Utiles.threadSleep3seg();

			
			Utiles.reportes("Se verifica el elemento Ordenar Por:, se visualice");
			Assert.assertTrue(homepage.validarBotonOrdenarPor(),"El elemento Ordenar Por:Promocionados no aparece");		
			Utiles.reportes("Se Hace despliege las opciones de Ordenar por: ");
			homepage.BotonOrdenarPor();
			Utiles.ThreadSleep2seg();
			Utiles.reportes("Se selecciona la opcion Precio: Promocionados ");
	        homepage.seleccionarOpcion("Promocionados");  
			Utiles.threadSleep3seg();

		}

	@Test(description = "Búsqueda con Filtro Ordenado por: Menor a Mayor")
	public void BuscarPorFiltroMenoraMayor() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();

		
		Utiles.reportes("Se verifica el elemento Ordenar Por:Menor a mayor");
		Assert.assertTrue(homepage.validarBotonOrdenarPor(),"El elemento Ordenar Por:Menor a mayor no aparece");		
		Utiles.reportes("Se Hace despliege las opciones de Ordenar por:Menor a mayor ");
		homepage.BotonOrdenarPor();
		Utiles.ThreadSleep2seg();
		Utiles.reportes("Se selecciona la opcion Precio: Menor a mayor ");
        homepage.seleccionarOpcion("Precio: Menor a mayor");  
		Utiles.threadSleep3seg();

	}
	
	@Test(description = "Búsqueda con Filtro Ordenado por Mayor a Menor")
	public void BuscarPorFiltroMayoraMenor() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();

		
		Utiles.reportes("Se verifica el elemento Ordenar Por: Mayor a Menor");
		Assert.assertTrue(homepage.validarBotonOrdenarPor(),"El elemento Ordenar Por Mayor a menor no aparece");		
		Utiles.reportes("Se Hace despliege las opciones de Ordenar por: ");
		homepage.BotonOrdenarPor();
		Utiles.ThreadSleep2seg();
		Utiles.reportes("Se selecciona la opcion Precio: Mayor a Menor ");
        homepage.seleccionarOpcion("Precio: Mayor a menor");  
		Utiles.threadSleep3seg();

	}
	
	@Test(description = "Búsqueda con Filtro Ordenado por: Mejor Puntuados")
	public void BuscarPorFiltroMejorPuntuados() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();

		
		Utiles.reportes("Se verifica el elemento Ordenar Por Mejor puntuados");
		Assert.assertTrue(homepage.validarBotonOrdenarPor(),"El elemento Ordenar Por Mejor Puntuados no aparece");		
		Utiles.reportes("Se Hace despliege las opciones de Ordenar por: ");
		homepage.BotonOrdenarPor();
		Utiles.ThreadSleep2seg();
		Utiles.reportes("Se selecciona la opcion Mejor puntuados ");
        homepage.seleccionarOpcion("Mejor puntuados");  
		Utiles.threadSleep3seg();

	}

	@Test(description = "Búsqueda con Filtro Ordenado por:Recien Arribados")
	public void BuscarPorFiltroRecienArribados() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();

		
		Utiles.reportes("Se verifica el elemento Ordenar Por: Recien Arribados");
		Assert.assertTrue(homepage.validarBotonOrdenarPor(),"El elemento Ordenar Por: Recien arribados no aparece");		
		Utiles.reportes("Se Hace despliege las opciones de Ordenar por: ");
		homepage.BotonOrdenarPor();
		Utiles.ThreadSleep2seg();
		Utiles.reportes("Se selecciona la opcion Recién arribados ");
        homepage.seleccionarOpcion("Recién arribados");  
		Utiles.threadSleep3seg();

	}
	
	@Test(description = "Búsqueda con Filtro Ordenado por: Mas Vendidos ")
	public void BuscarPorFiltroMasVendidos() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		Utiles.ThreadSleep2seg();
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();

		
		Utiles.reportes("Se verifica el elemento Ordenar Por:, se visualice");
		Assert.assertTrue(homepage.validarBotonOrdenarPor(),"El elemento Ordenar Por:Mas vendidos no aparece");		
		Utiles.reportes("Se Hace despliege las opciones de Ordenar por: ");
		homepage.BotonOrdenarPor();
		Utiles.ThreadSleep2seg();
		Utiles.reportes("Se selecciona la opcion Mas Vendidos ");
        homepage.seleccionarOpcion("Mas Vendidos");  
		Utiles.threadSleep3seg();

	}

	
	@Test(description = "Búsqueda por tienda ebay")
	public void BuscarPortiendaEbay() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();
		
		Utiles.reportes("Verificamos que el boton de la tienda ebay exita");
		Assert.assertTrue(homepage.validarBottonTiendaEbay());
		Utiles.reportes("Hacemos click en el boton de la tienda ebay");
		homepage.clickBottonTiendaEbay();
		Utiles.threadSleep3seg();
		
	}
	@Test(description = "Búsqueda por tienda mcy")
	public void BuscarPortiendaMcy() throws Exception {
		tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
		
		Utiles.ThreadSleep2seg();
		
		Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.cerrarPopup1();
		Utiles.threadSleep5seg();
		
		Utiles.reportes("Se verifica el elemento Pup-up exista");
		Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
		Utiles.reportes("Se cierra pup-up");
		homepage.Cerrarpopup2();
		Utiles.ThreadSleep2seg();
		
		Utiles.reportes("Se verifica que la caja de busqueda exista");
		Assert.assertTrue(homepage.validarCajaDeBusqueda2(), "La caja de busqueda no se visualiza");
		Utiles.reportes("A la caja de busqueda le tipeamos la palabra Camisa Azul");
		homepage.ingresarCajadeBusqueda2("camisa azul");
		homepage.clickCajadeBusqueda2();
		Utiles.threadSleep3seg();
		
		Utiles.reportes("Verificamos que el boton de la tienda ebay exita");
		Assert.assertTrue(homepage.validarBottonTiendaMcy());
		Utiles.reportes("Hacemos click en el boton de la tienda ebay");
		homepage.clickBottonTiendaMcy();
		Utiles.threadSleep3seg();
		
	}
	    
		@Test(description = "Búsqueda con Filtros por categoria Calzado-Hombre-Deportivo")
		public void BuscarCategoriaDeportivo() throws Exception {
			tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
			
			Utiles.ThreadSleep2seg();
			
			Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
			Utiles.reportes("Se cierra pup-up");
			homepage.cerrarPopup1();
			Utiles.threadSleep5seg();
			
			Utiles.reportes("Se verifica el elemento Pup-up exista");
			Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
			Utiles.reportes("Se cierra pup-up");
			homepage.Cerrarpopup2();
			
			Utiles.reportes("Se verifica el boton Todas las categorias se visualice");
			Assert.assertTrue(homepage.validarBotonCategorias(),"El boton Todas las categorias no aparece");
			homepage.clickBotonCategorias();
			Utiles.reportes("Se Hace despliege las opciones de todas las categorias ");
			Utiles.ThreadSleep2seg();
			
			homepage.seleccionarListaCalzado();
			Utiles.ThreadSleep2seg();
			Utiles.reportes("Se Hace despliege las opciones de la categoria Calzado ");

			
			homepage.seleccionarListaDeportivo();
			Utiles.ThreadSleep2seg();
			Utiles.reportes("Se Hace despliege las opciones de la categoria Deportivo ");
			

			Utiles.threadSleep5seg();

			
		}   
	    
		@Test(description = "Comparacion de los precios de dos productos con Filtros por categoria Calzado-Hombre-Deportivo")
		public void comparacionDePrecio() throws Exception {
			tiendaMiaHomePages homepage=PageFactory.initElements(driver,tiendaMiaHomePages.class);
			
			Utiles.ThreadSleep2seg();
			
			Assert.assertTrue(homepage.validarPopup1Exista(),"El pup-up no aparece");
			Utiles.reportes("Se cierra pup-up");
			homepage.cerrarPopup1();
			Utiles.threadSleep5seg();
			
			Utiles.reportes("Se verifica el elemento Pup-up exista");
			Assert.assertTrue(homepage.validarPopup2Exista(),"El Pup-up no aparece");
			Utiles.reportes("Se cierra pup-up");
			homepage.Cerrarpopup2();
			
			Utiles.reportes("Se verifica el boton Todas las categorias se visualice");
			Assert.assertTrue(homepage.validarBotonCategorias(),"El boton Todas las categorias no aparece");
			homepage.clickBotonCategorias();
			Utiles.reportes("Se Hace despliege las opciones de todas las categorias ");
			Utiles.ThreadSleep2seg();
			
			homepage.seleccionarListaCalzado();
			Utiles.ThreadSleep2seg();
			Utiles.reportes("Se Hace despliege las opciones de la categoria Calzado ");

			
			homepage.seleccionarListaDeportivo();
			Utiles.ThreadSleep2seg();
			Utiles.reportes("Se Hace despliege las opciones de la categoria Deportivo ");
			Utiles.threadSleep5seg();
			
			Utiles.reportes("Se Compara el precio del primer producto seleccionado con el segundo producto seleccionado ");
			homepage.comparacionNumeros();
			
		}   
      
	

}
