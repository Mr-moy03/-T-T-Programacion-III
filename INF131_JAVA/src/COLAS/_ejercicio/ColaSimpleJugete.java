package COLAS._ejercicio;


import java.util.Scanner;

public class ColaSimpleJugete extends colaJug{
    public ColaSimpleJugete(){
       super();
    }
    public boolean esVacia(){
        return fr == fi;
    }
    public boolean esLlena(){
        return fi == max-1;
    }

    public void adi(Jugete elem){
        if(esLlena()){
            System.out.println("Cola llena");
        }
        else{
            fi++;
            v[fi] = elem;
        }
    }

    public Jugete eli(){
        Jugete elem = null;
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

    public void vaciar(ColaSimpleJugete z){
        while (!z.esVacia()){
            adi(z.eli());
        }
    }

    public void llenar(int n){
        Scanner lee = new Scanner(System.in);
        System.out.println("Intr datos: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Jugete_" + i + ": ");
            String nombre = lee.nextLine();
            String tipo = lee.nextLine();
            int nivelDes = lee.nextInt();
            String dueñoAnt = lee.nextLine();

            lee.nextLine();

            Jugete x = new Jugete(nombre, tipo, nivelDes,dueñoAnt);
            this.adi(x);
        }
        //lee.close();
    }

    public void mostrar(){
        ColaSimpleJugete aux = new ColaSimpleJugete();
        Jugete x = null;
        while (!esVacia()){
            x = eli();
            x.mostrar();
            aux.adi(x);
        }
        vaciar(aux);
    }
    public void reiniciar() {
    	this.fr = -1;
        this.fi = -1;
    }

}
