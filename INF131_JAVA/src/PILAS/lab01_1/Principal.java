package PILAS.lab01_1;

public class Principal {
    public static void main(String[] args) {
    	System.out.println("Nombre:Limbert Moises Perez Herrera");
    	System.out.println("Nombre:");
    	//A) 
    	System.out.println("_A)_");
    	PilaAgenda A = new PilaAgenda();

        Agenda a1 = new Agenda("Escuela");
        Contacto c21 = new Contacto("luis",70321654);
        Contacto c22 = new Contacto("juan",70012345);
        Contacto c23 = new Contacto("may",60012345);
        Contacto c24 = new Contacto("moises",70012345);
        a1.addContacto(c21);
        a1.addContacto(c22);
        a1.addContacto(c23);
        a1.addContacto(c24);

        Agenda a2 = new Agenda("Uni");
        Contacto c11 = new Contacto("luis",66879665);
        Contacto c12 = new Contacto("juan",70654654);
        Contacto c13 = new Contacto("moyo",71654654);
        
        a2.addContacto(c11);
        a2.addContacto(c12);
        a2.addContacto(c13);
        
        Agenda a3 = new Agenda("Colegio");
        Contacto c01 = new Contacto("luis",77000012);
        Contacto c02 = new Contacto("juan",61111231);

        a3.addContacto(c01);
        a3.addContacto(c02);
        
        Agenda a4 = new Agenda("taller");
        Contacto c31 = new Contacto("maria",78321654);
        Contacto c32 = new Contacto("mayra",12212345);
        Contacto c33 = new Contacto("juan",60112345);
        Contacto c34 = new Contacto("ilse",63312345);
        Contacto c35 = new Contacto("moy",71112345);
        a4.addContacto(c31);
        a4.addContacto(c32);
        a4.addContacto(c33);
        a4.addContacto(c34);
        a4.addContacto(c35);
        
        A.push(a1);
        A.push(a2);
        A.push(a3);
        A.push(a4);
        
        //A.mostrar();
        
        //B
        System.out.println("_B)_");
        
        mostrarAgendasConNumero(A,77000012);
        
        //C)
        System.out.println("_C)_");
        ordenarAscPorNroContactos(A);
        A.mostrar();
        
        
        
    }
    
    public static void mostrarAgendasConNumero(PilaAgenda A, int z) {
        PilaAgenda aux = new PilaAgenda();
        System.out.println("Agendas que contienen el número " + z + ":");
        boolean hay = false;
        while (!A.esVacia()) {
            Agenda a = A.pop();
            //a.mostrar();
            for (int i = 0; i < a.getNroctos(); i++)
                if (a.getV()[i].getNroCel() == z)
                    System.out.println(" - " + a.getNom());
                    hay = true;
            aux.push(a);
        }
        if (!hay)
            System.out.println("(ninguna)");
        A.vaciar(aux);
    }
    
    public static void ordenarAscPorNroContactos(PilaAgenda A) {
        PilaAgenda ord = new PilaAgenda();
        while (!A.esVacia()) {
            Agenda min = A.pop();
            PilaAgenda aux = new PilaAgenda();
            while (!A.esVacia()) {
                Agenda y = A.pop();
                if (y.getNroctos() < min.getNroctos()) {
                    aux.push(min);
                    min = y;
                }
                else aux.push(y);
            }
            ord.push(min);
            A.vaciar(aux);
        }
        A.vaciar(ord);
    }
}