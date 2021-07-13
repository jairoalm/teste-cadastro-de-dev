package br.com.jairo.config;

import org.junit.After;
import org.junit.Before;


public class Listener {
	
	@Before
	public void inicializar(){
		DriverFactory.getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/formulario.html");
	}
	@After
	public void finaliza(){
		DriverFactory.getDriver().quit();
	}

}
