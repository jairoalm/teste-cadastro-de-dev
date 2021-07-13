package br.com.jairo.page;

import org.openqa.selenium.By;

public class CadastroPage extends BasePage {

	public void setInteragir_Com_Campo_Nome(String texto) {
		escrever("nome", texto);
	}

	public void setInteragir_Com_Campo_Sobrenome(String texto) {
		escrever("sobrenome", texto);
	}

	public void setInteragir_Com_Campo_Email(String texto) {
		escrever("email", texto);
	}
	
	public void selecionar_Aplicacao(){
		selecionar_Tipo_De_Aplicacao(By.xpath("//label//input[@value='backend']"));
	}
	
	public void selecionar_Senioridade(String texto){
	    selecionar_Tipo_De_Senioridade("senioridade", texto);
	}
	
	public void selecionar_Tecnologia(){
		selecionar_Tipo_De_Tecnologia("tecnologia4");
	}
	
	public void setExperiencia(String texto){
		escrever("experiencia", texto);
	}

	public void clicar_Botao_Concluido() {
		clicar_No_Botao(By.xpath("//button[@type='submit']"));
	}

	public String getCapturarTexto() {
		return obterTexto("titulo");

	}

}
