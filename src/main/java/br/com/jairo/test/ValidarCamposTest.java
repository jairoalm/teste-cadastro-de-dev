package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;


import br.com.jairo.page.CadastroPage;

public class ValidarCamposTest {
	
	CadastroPage cadastro = new CadastroPage();
	
	@Test
	public void validar_Campos(){
		
		cadastro.setInteragir_Com_Campo_Nome("123456");
		cadastro.setInteragir_Com_Campo_Sobrenome("223323");
		cadastro.setInteragir_Com_Campo_Email("1231213");
		cadastro.clicar_Botao_Concluido();
		
		Assert.assertEquals("Cadastro de DEVs", cadastro.getCapturarTexto());
		System.out.println("Validar Campos!");
		
	}

}
