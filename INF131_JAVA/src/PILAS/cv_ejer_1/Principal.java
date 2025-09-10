package PILAS.cv_ejer_1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("nombre: marcelo aruquipa");
		System.out.println("TEma: PILA DE CARACTERES\n");
		
		PilaCadenas z = new PilaCadenas();
		z.llenar(5);
		/*
		z.adi('a');
		z.adi('x');
		z.adi('o');
		z.adi('z');
		z.adi('e');
		*/
		
		z.mostrar();
		
	}
}
