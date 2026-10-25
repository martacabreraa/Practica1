package es.upm.practica;

public class Practica {  
	
	
	public static void main(String[] args) {
		int contador=0;
		double numero = 4.5;
		int[] array = {1,3,2,4,6,8,9,5,3,2,5,7};
	    System.out.println("Hola");
	    
	    for(int i=0; i<array.length; i++) {
	    	if(array[i]>= 5) {
	    		contador++;
	    	}
	    }
	    System.out.println("El número de aprobados es" + " " + contador);
	
	
	if (numero > 0) {
		System.out.println("Positivo");
		
	}else if (numero < 0){
		System.out.println("Negativo");
	}else {
		System.out.println("Cero");
		
	}
	
	}
}
