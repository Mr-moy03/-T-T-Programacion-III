package COLAS.pdf_1;

public class Main {
    public static void main(String[] args){
        //Estudiante est1 = Estudiante.leer();
        //est1.mostrar();

        colaSimpleEst A = new colaSimpleEst();
        //A.llenar(10);

        Estudiante est1 = new Estudiante("Luis","INF111",91);
        Estudiante est2 = new Estudiante("Moy","INF111",51);
        Estudiante est3 = new Estudiante("May","INF111",41);
        Estudiante est4 = new Estudiante("Juan","INF111",1);
        A.adi(est1);
        A.adi(est2);
        A.adi(est3);
        A.adi(est4);



        A.mostrar();

    }
}
