package cl.generation.f20221024;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero3 = 20;
		long numero4 = 12312312312l;
		float numero5= 435342432f;
		double numero6 = 1231231243223d;
		
		System.out.println(Integer.valueOf(numero3).longValue());
		System.out.println(Integer.valueOf(numero3).floatValue());
		System.out.println(Integer.valueOf(numero3).doubleValue());
		System.out.println(Long.valueOf(numero4).intValue());
		System.out.println(Long.valueOf(numero4).floatValue());
		System.out.println(Long.valueOf(numero4).doubleValue());
		System.out.println(Float.valueOf(numero5).doubleValue());
		
	}

}
