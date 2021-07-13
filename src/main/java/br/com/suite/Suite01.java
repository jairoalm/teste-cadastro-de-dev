package br.com.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jairo.test.CadastroTest;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroTest.class,
})
public class Suite01 {

}
