package COLAS._ejercicio;

public class Main {
	public static void main(String[] args){
    	System.out.println("> Nombre: Limbert Moises Perez Herrera" );
		System.out.println("> Ci: 10015087" );

        ColaSimpleJugete cola1 = new ColaSimpleJugete();
        //A.llenar(10);

        Jugete j1 = new Jugete("lotso","Peluche",80,"Anita");
        Jugete j2 = new Jugete("wooddy","Muñeco",20,"Andy");
        Jugete j3 = new Jugete("Buzz","Muñeco",1,"Andy");
        Jugete j4 = new Jugete("Bonn","Muñeco",80,"Anya");

        cola1.adi(j2);
        cola1.adi(j1);
        cola1.adi(j3);
        cola1.adi(j4);

        cola1.mostrar();
        System.out.println("Nro de elem: " + cola1.nroElem());
        
        //A)
        //System.out.println("_A)_");
        //mostrarJugeteDueño(cola1,"Andy");
        
      	//B)
        System.out.println("_B)_");
        nivelDesgaste(cola1);
        cola1.mostrar();
		//C)
		System.out.println("_C)_");
		ordenarJugetes(cola1);
		cola1.mostrar();
		//D)
		System.out.println("_D)_");
		eliminarJugetes(cola1);
		cola1.mostrar();

    }
    public static void mostrarJugeteDueño(ColaSimpleJugete c,String x) {
    	ColaSimpleJugete aux = new ColaSimpleJugete();
	    Jugete elem;
	    boolean sw = true;
	    while (!c.esVacia()){
	    	elem = c.eli();
	    	if (elem.getDueñoAnt().equals(x)) {
	    		System.out.printf("Nombre: %s, Tipo: %s\n",elem.getNombre(),elem.getTipo());
	    		sw = false;
	    		//elem.mostrar();
	    	}
	        aux.adi(elem);
	    }
	    c.reiniciar();
	    c.vaciar(aux);
	    if(sw) {
	    	System.out.println("No hay jugetes a ese nombre");
	    }
    }
    
    public static void nivelDesgaste(ColaSimpleJugete c) {
    	ColaSimpleJugete aux = new ColaSimpleJugete();
    	ColaSimpleJugete aux2 = new ColaSimpleJugete();
	    Jugete elem;
	    while (!c.esVacia()){
	    	elem = c.eli();
	    	if (elem.getNivelDes() >= 50) {
	    		aux2.adi(elem);
	    	}
	    	else {
	    		aux.adi(elem); 
	    	}
	    }
	    c.vaciar(aux);
	    c.vaciar(aux2);
    }
	public static void ordenarJugetes(ColaSimpleJugete c) {
		ColaSimpleJugete ordenada = new ColaSimpleJugete();
		Jugete elem, min;

		while (!c.esVacia()) {
			min = c.eli();
			ColaSimpleJugete aux = new ColaSimpleJugete();
			while (!c.esVacia()) {
				elem = c.eli();
				if (elem.getNivelDes() < min.getNivelDes()) {
					aux.adi(min);
					min = elem;
				} else {
					aux.adi(elem);
				}
			}
			ordenada.adi(min);
			c.vaciar(aux);
		}
		c.vaciar(ordenada);
	}
	public static void eliminarJugetes(ColaSimpleJugete c) {
		ColaSimpleJugete aux = new ColaSimpleJugete();
		Jugete elem;
		while (!c.esVacia()){
			elem = c.eli();
			if (elem.getNivelDes() >= 80 && !elem.getTipo().equals("Peluche")) {
			} else {
				aux.adi(elem);
			}
		}
		c.vaciar(aux);
	}

}
