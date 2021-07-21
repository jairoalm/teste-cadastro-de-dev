package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.page.CadastroPage;

public class ValidarRegrasNegociosTest {
	
	CadastroPage cadastro = new CadastroPage();
	
	
	@Test
	public void regrasDeNegocio(){
		cadastro.setInteragir_Com_Campo_Nome("");
		cadastro.setInteragir_Com_Campo_Sobrenome("teste");
		cadastro.setInteragir_Com_Campo_Email("teste@teste.com");
		cadastro.clicar_Botao_Concluido();
		
		Assert.assertEquals("Cadastro de DEVs", cadastro.getCapturarTexto());
		System.out.println("Validar regras de negócio!");
	}

}
