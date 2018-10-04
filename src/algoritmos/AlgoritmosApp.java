package algoritmos;
import java.util.Scanner;

public class AlgoritmosApp {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Ciclos obj = new Ciclos();
		codicionales alumno = new codicionales();
		codicionales empleado = new codicionales();
		codicionales numero = new codicionales();
		
		int base=0;
		int exponente=0;
		int calificacion;
		int asistencia;
		int costo;
		int hora, minuto, segundo, incremento;
		int n, n2,n3;
		
		//System.out.println("Ingrese una base: ");
		//base=leer.nextInt();
		//System.out.println("Ingrese un exponente: ");
		//exponente=leer.nextInt();
		
		//System.out.println("El resultado es: "+ obj.potencia(base, exponente));
		
		//System.out.print("Ingresa tu calificación: ");
		//calificacion=leer.nextInt();
		//System.out.print("Ingresa tu total de asistencias: ");
		//asistencia=leer.nextInt();
		
		//System.out.println("Pasaste: "+alumno.acreditar(asistencia, calificacion));
		  
		//System.out.println("Horas Trabjadas: ");
		//hora=leer.nextInt();
		//System.out.println("Pagor por hora: ");
		//costo=leer.nextInt();
		
		//if(hora<40)
			//System.out.println("Total a pagar: "+ empleado.salario(hora, costo));
		//else
			//System.out.println("Tienes un bono por horas extras: "+ empleado.salario(hora, costo));
		
		//System.out.println("Primer numero: ");
		//n=leer.nextInt();
		//S7ystem.out.println("Segundo numero: ");
		//n2=leer.nextInt();
		//System.out.println("Tercer numero: ");
		//n3=leer.nextInt();
		//numero.medio(n, n2, n3);
		//System.out.println("Ingrese horas, minutos y segundos");
		//hora=leer.nextInt();
		//minuto=leer.nextInt();
		//segundo=leer.nextInt();
		//System.out.println("Incresa el incremento: ");
		//incremento=leer.nextInt();
		//numero.hora(hora, minuto, segundo, incremento);	
		
		/*System.out.print("Ingrese un numero de 4 digitos: ");
		n=leer.nextInt();
		if(n>4) System.out.println(""+numero.invertirNumero(n));
		else System.out.println("Tu entrada debe de ser de 4 digitos");*/
		
		System.out.print("Ingresa un numero:");
		n=leer.nextInt();
	
		do {
			
			System.out.print("Adivina el numero: ");
			n2=leer.nextInt();
			
		}while(numero.adivinar(n, n2) != "Adivinaste el numero");
	
	}
}
