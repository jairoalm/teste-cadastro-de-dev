package br.com.jairo.config;

public class Propriedade {
	
	public static boolean FECHAR_BROWSER = false; 
	
	public static Browsers browser = Browsers.CHROME;
	
	public enum Browsers{
		CHROME,
		FIREFOX,
		IE,
		SAFARI,
		OPERA
		
	}

}
