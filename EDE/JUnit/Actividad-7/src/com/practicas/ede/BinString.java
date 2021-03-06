//Primer cambio: Ad�n Risue�o Ripoll

package com.practicas.ede;

// �Qu� puede hacer esta Clase? 
public class BinString {
	public BinString(){}

	// �Qu� hace este m�todo? Le pasamos un String este lo pasa a binario segun el codigo ascii del primer String introducido
	public String convertir(String s){
		return aBinario(sumar(s));
	}
	
	// �Qu� hace este m�todo?  Recibe un String y lo convierte a numeros segun su caracter en ASCII
	public int sumar(String s){
		String s1 = s.substring(0);
		int sum = 0;
		while(!s1.equals(""))
		{
			sum = sum+(int)(s1.charAt(0));
			s1 = s1.substring(1);
		}
		
		return sum;
	}
	
	// �Qu� hace este m�todo? Dependiendo del numero ASCII nos dar� un 1 o 0 sacando su resto con el %
	public String aBinario(int n){
	    String s = "";
	    
	    while (n > 0)
	    {
	    	if(n%2==0)
	    		s = "0"+s;
	    	else
	    		s = "1"+s;
	        n = n / 2;
	    }
	    
	    return s;
	}
}