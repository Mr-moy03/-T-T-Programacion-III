package Practica.colas.ejer4_2;

public class Main {
    public static void main(String[] args){
        Estudiante est1 = new Estudiante(123,"Luis",4,51.2,"informatica");
        Estudiante est2 = new Estudiante(125,"Ivan",5,90.1,"estadistica");
        Estudiante est3 = new Estudiante(127,"Marcelo",6,61.2,"matematica");
        Estudiante est4 = new Estudiante(129,"Ilse",4,31.4,"informatica");
        Estudiante est5 = new Estudiante(130,"Cristina",1,71.9,"informatica");
        Cola cola1 = new Cola();
        cola1.push(est1);
        cola1.push(est2);
        cola1.push(est3);
        cola1.push(est4);
        cola1.push(est5);
        cola1.mostrar();
        System.out.println("__A)__");
        mayorNumeroDeEstudiantes(cola1);
        System.out.println("__B)__");
        System.out.println("__C)__");
        System.out.println("__D)__");
    }
    public static void mayorNumeroDeEstudiantes(Cola c){
        Cola aux1 = new Cola();

        Estudiante elem,may;
        int cont1 = 0,cont2=0;

        int cont = 0;
        while(!c.esVacia()){
            elem = c.pop();
            while (!c.esVacia()){
            }




            aux1.push(elem);
        }
        c.reset();
        c.vaciar(aux1);

    }
}
