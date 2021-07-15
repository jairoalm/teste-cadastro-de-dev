package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.page.CadastroPage;

public class CadastroTest extends Listener{
	
	CadastroPage cadastro = new CadastroPage();
	
	@Test
	public void preencher_Campos_Do_Formulario() {
		cadastro.setInteragir_Com_Campo_Nome("Neymar");
		cadastro.setInteragir_Com_Campo_Sobrenome("Junior");
		cadastro.setInteragir_Com_Campo_Email("neymar@gmail.com");
		cadastro.selecionar_Aplicacao();
		cadastro.selecionar_Senioridade("Pleno");
		cadastro.selecionar_Tecnologia();
		cadastro.setExperiencia("Conhecimento em Java!");
		cadastro.clicar_Botao_Concluido();
		
		Assert.assertEquals("Cadastro de DEVs", cadastro.getCapturarTexto());
		
		System.out.println(cadastro.getCapturarTexto());		
	}
	
	@Test
	public void validar_campos(){
		
		cadastro.setInteragir_Com_Campo_Nome("123456");
		cadastro.setInteragir_Com_Campo_Sobrenome("223323");
		cadastro.setInteragir_Com_Campo_Email("1231213");
		cadastro.clicar_Botao_Concluido();
		
		Assert.assertEquals("Cadastro de DEVs", cadastro.getCapturarTexto());
		
	}
}
