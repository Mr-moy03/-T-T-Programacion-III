package PILAS.lab01_1;

public class main {
    public static void main(String[] args){

        Contacto c1 = new Contacto("Luis",78621354);

        //c1.mostrar();

        Agenda a1 = new Agenda("Talleres");
        a1.addContacto(c1);

        a1.mostrar();


    }
}
