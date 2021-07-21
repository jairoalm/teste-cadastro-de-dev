package br.com.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jairo.test.CadastroTest;
import br.com.jairo.test.ValidarCamposCaracteresTest;
import br.com.jairo.test.ValidarCamposTest;
import br.com.jairo.test.ValidarRegrasNegociosTest;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroTest.class,
	ValidarCamposTest.class,
	ValidarCamposCaracteresTest.class,
	ValidarRegrasNegociosTest.class
	
})
public class Suite01 {

}
