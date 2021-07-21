package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.page.CadastroPage;

public class ValidarCamposCaracteresTest {
	
	CadastroPage cadastro = new CadastroPage();
	
	@Test
	public void validar_Campos_Com_Varios_Caracteres(){
		cadastro.setInteragir_Com_Campo_Nome("asdfghjklertyuiopcvb");
		cadastro.setInteragir_Com_Campo_Sobrenome("asdfghjklertyuiopcvb");
		cadastro.setInteragir_Com_Campo_Email("asdfghjklertyuiopcvb");
		cadastro.clicar_Botao_Concluido();
		
		Assert.assertEquals("Cadastro de DEVs", cadastro.getCapturarTexto());
		System.out.println("Validar Campos caracteres!");
	}

}
