package algoritmos;

public class Ciclos {
	
	public int potencia(int base, int exponente)
	{
		int res =1;
		for(int i=0; i<exponente; i++) res*=base;
			
		return res;
	}
	
	public String primo(int numero) {
		
		int divisor=2;
		String respuesta="";
		do{
			if((numero/divisor)<numero && numero%divisor!=0) respuesta="Es primo";
			else respuesta="No es primo";
			divisor++;
		}
		while(divisor<numero);
	
		return respuesta;
	}
}
