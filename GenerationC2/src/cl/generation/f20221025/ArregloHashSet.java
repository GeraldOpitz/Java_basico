package cl.generation.f20221025;

import java.util.HashMap;
import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// set o HasSet
		//1.- Definicion st o HashSet 
		///HashSet<TIPODATO> nombre_array= new HashSet<TIPODATO>();
		HashSet<String> relatores= new HashSet<String>();
		
		//2.- Agregar elemento al arreglo
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Alejandro");
		relatores.add("Israel");
		System.out.println(relatores);//orden aleatorio
		
		//3.- Verificar el contenido del arreglo
		boolean verificacionNombre = relatores.contains("Pamela");
		System.out.println(verificacionNombre);

		
		//4.- eliminar un elemento por el contenido
		relatores.remove("Andrea");
		System.out.println(relatores);
		
		//5.- tamaño del arreglo
		
		
		System.out.println("tamaño del hashset: "+relatores.size());
		
	    HashMap<Integer, String> capitalCities = new HashMap<Integer, String>();
	    capitalCities.put(0, "London");
	    capitalCities.put(1, "Berlin");
	    capitalCities.put(2, "Oslo");
	    capitalCities.put(3, "Washington DC");
	    System.out.println(capitalCities); 
		
	}

}
