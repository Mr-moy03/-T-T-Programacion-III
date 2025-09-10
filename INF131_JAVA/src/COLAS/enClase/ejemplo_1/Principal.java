package COLAS.enClase.ejemplo_1;

public class Principal {
    public static void main(String[] arg){
        Persona p1 = new Persona("luis", 18, "m");
        Persona p2 = new Persona("may", 20, "f");
        Persona p3 = new Persona("juan", 20, "m");
        Persona p4 = new Persona("maria", 21, "f");
        Persona p5 = new Persona("lis", 19, "f");

        ColaSimplePersona cola = new ColaSimplePersona();
        cola.push(p1);
        cola.push(p2);
        cola.push(p3);
        cola.push(p4);
        cola.push(p5);
        //System.out.println(cola);
        cola.mostrar();

        //enciso a)
        System.out.println("promedio: "+promEdad(cola));

        //enciso b)
        System.out.println("Nro de Personas mayores: "+contarGenMayEdad(cola,20,"m"));


    }

    private static int promEdad(ColaSimplePersona cola) {
        ColaSimplePersona aux = new ColaSimplePersona();
        int sum = 0;
        Persona x;
        while (!cola.esVacia()){
            x = cola.pop();
            sum += x.getEdad();
            aux.push(x);
        }
        cola.vaciar(aux);
        return (sum / cola.nroElem());
    }

    public static int contarGenMayEdad(ColaSimplePersona c, int edad,String gen){
        ColaSimplePersona aux = new ColaSimplePersona();
        int cont = 0;
        Persona x;
        while(!c.esVacia()){
            x = c.pop();
            if (x.getGenero() == gen && x.getEdad() == edad){
                cont++;
            }
            aux.push(x);
        }
        c.vaciar(aux);
        return cont;
    }

}
