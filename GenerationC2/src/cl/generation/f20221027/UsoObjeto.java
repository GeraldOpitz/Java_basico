package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// instancia de clase
		Auto auto1 = new Auto();
		auto1.text="dafadsf";
		//auto1.color="rojo";
		
		//asignar valores a los atributos privados
		//solo a traves del metodo setter
		auto1.setColor("rojo");
		auto1.setMarca("Peugeot");
		
		//consultar el contenido de los atributos
		
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());
		
		//saber el contenido de los atributos	
			
		System.out.println(auto1.toString());	
		
		
		//nueva instancia de auto
		
		Auto car = new Auto("Nissan","Negro","Qashqai",1.6f,10.0f,240f)	;
		System.out.println(car.getModelo());
		
		System.out.println(car.toString());
		
	}

}		
