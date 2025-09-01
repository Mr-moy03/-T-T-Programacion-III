package COLAS.pdf_1;

import PILAS.lab01.Celular;
import PILAS.lab01.PilaCe;

import java.util.Scanner;

public class colaSimpleEst extends colaEst{
    public colaSimpleEst(){
       super();
    }
    public boolean esVacia(){
        return fr == fi;
    }
    public boolean esLlena(){
        return fi == max-1;
    }

    public void adi(Estudiante elem){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fi++;
            v[fi] = elem;
        }
    }

    public Estudiante eli(){
        Estudiante elem = null;
        if(esVacia()){
            System.out.println("Cola vacia");
        }
        else{
            fr++;
            elem = v[fr];
        }
        return elem;
    }

    public int nroElem(){
        return (fi - fr);
    }

    public void vaciar(colaSimpleEst z){
        while (!z.esVacia()){
            adi(z.eli());
        }
    }

    public void llenar(int n){
        Scanner lee = new Scanner(System.in);
        System.out.println("Intr datos: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("est " + i + ": ");
            String nombre = lee.nextLine();
            String materia = lee.nextLine();
            int nota = lee.nextInt();

            lee.nextLine();

            Estudiante x = new Estudiante(nombre, materia, nota);
            this.adi(x);
        }
        //lee.close();
    }

    public void mostrar(){
        colaSimpleEst aux = new colaSimpleEst();
        Estudiante x = null;
        while (!esVacia()){
            x = eli();
            x.mostrar();
            aux.adi(x);
        }
        vaciar(aux);
    }

}
