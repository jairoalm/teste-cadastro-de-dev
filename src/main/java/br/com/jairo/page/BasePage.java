package br.com.jairo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.jairo.config.DriverFactory;

public class BasePage {	
	
	/***** Texto *****/
	public void escrever(By by, String texto){
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	}
	public void escrever(String id, String texto){
		escrever(By.id(id),(texto));
	}
	
	/***** Radio *****/
	public void selecionar_Tipo_De_Aplicacao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void selecionar_Tipo_De_Aplicacao(String id){
		selecionar_Tipo_De_Aplicacao(By.id(id));
	}
	
	/***** Combo *****/	
	public void selecionar_Tipo_De_Senioridade(String id, String texto){
		WebElement elemento = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(elemento);
		combo.selectByVisibleText(texto);		
	}
	
	/***** Check *****/
	public void selecionar_Tipo_De_Tecnologia(String id){
		DriverFactory.getDriver().findElement(By.id(id)).click();
	}
	
	/***** Botão *****/
	public void clicar_No_Botao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	public void clicar_No_Botao(String id){
		clicar_No_Botao(By.id(id));
	}
	
	/***** Texto *****/
	public String obterTexto(String id){
		return DriverFactory.getDriver().findElement(By.id(id)).getText();		
	}

}
