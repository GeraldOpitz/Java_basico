package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		//Arreglo (Array) en java
		//(estaticos, no cambia de tamaño)
		int[] arreglo= new int[3];
		//arreglo.length; tamaño del arreglo
		
		//agregar datos 
		arreglo[0] = 4;
		arreglo[1] = 8;
		arreglo[2] = 12;
		//arreglo[3] = 24;//Error fuera de indice
		System.out.println(arreglo.toString());
		
		//imprimir arreglo
		System.out.println(Arrays.toString(arreglo));
		//imprimir elemento segun su indice
		System.out.println(arreglo[0]);
		
		//{}
		int[] sinNumeros = {};//cero
		System.out.println(sinNumeros.length);
		//sinNumeros[0]=78;//para un arreglo vacio NO SE PUEDE
		System.out.println(Arrays.toString(sinNumeros));
		
		String[] vocales = {"a","e","i","o","u"};
		System.out.println("Cantidad de elementos "+vocales.length);
		vocales[1]="o";
		vocales[3]="e";
		vocales[2]="y";
		//vocales[0]=1+"";
		
		//crear un array de numeros flotantes de tamaño 6
		
		float[] numeros = new float[6];
		//agregar 
		numeros[0]=33;
		numeros[0]=-0.6f;
		System.out.println(Arrays.toString(numeros));
		
		int[] numeroInt= new int[2];
		numeroInt[0]=(int) 0.2;//0.0
		System.out.println(numeroInt[0]);
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente desde el 1 al 100
		int[] numbers=new int[100];
		for (int i=0; i < numbers.length;i++) {
			numbers[i] = i+1;
		}
		System.out.println(Arrays.toString(numbers));
		
		
		int[] numbersN = new int[100];
		for (int i=numbersN.length; i > 0; i--) {
			numbersN[numbersN.length-i] = i;
		}
		System.out.println(Arrays.toString(numbersN));
		
	}

}
