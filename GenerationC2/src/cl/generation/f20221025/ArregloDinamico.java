package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		//1.- Definicion
		ArrayList<String> Grupo_3 = new ArrayList<String>();
		//2.-Agregar valores al arreglo
		Grupo_3.add("Gerald");
		Grupo_3.add("Brisa");
		Grupo_3.add("Barbara");
		Grupo_3.add("Fatima");
		Grupo_3.add("Sebastian");
		System.out.println(Grupo_3);
		//3.- tamaño del arraylist
		System.out.println(Grupo_3.size());
		/*lenght--> arreglos estaticos; size --> arreglos dinamicos*/
		//4.- obtener un elemento dentro del arreglo
		System.out.println(Grupo_3.get(4));
		//System.out.println(Grupo_3.get(7));//fuera de indice
		//5.- Eliminar un elemento dentro del array
		Grupo_3.remove(3);
		Grupo_3.remove(1);
		//6.- recorrer el ArrayList
		for(int i = 0; i < Grupo_3.size();i++) {
			System.out.println(Grupo_3.get(i));
		}
		System.out.println("**********************");
		// for iterador o for de objeto
		for(String integrante: Grupo_3) {
			System.out.println(integrante);
		}
		
		
		
	}

}
