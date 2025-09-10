package PILAS.lab01;
import java.util.Scanner;

public class PilaCe {
    private int tope;
    private int max = 50;
    private Celular v[] = new Celular[max];

    public PilaCe(){
        this.tope = -1;
    }
    public boolean esVacia(){
        return (tope == -1);
    }

    public boolean esLlena(){
        return (tope == max-1);
    }
    public void push(Celular c){ //adiccionar
        if(!esLlena()){
            tope++;
            v[tope] = c;
        }
        else{
            System.out.println("Pila llena");
        }
    }

    public Celular pop(){ //eliminar
        Celular elem = null;
        if(!esVacia()){ //si la pila no es vacia
            elem = this.v[this.tope];
            this.tope--; //decrementamos en una unidad
        }
        else
            System.out.println("Pila es vacia!!!!");
        return elem;
    }
    public void mostrar(){
        PilaCe aux = new PilaCe();
        while (!esVacia()){
            Celular x = pop();
            x.mostrar();
            aux.push(x);
        }
        vaciar(aux);
    }

    public void vaciar(PilaCe p){
        while(!p.esVacia()){  //mientras la pila p NO es vacia
            this.push(p.pop());
        }
    }

    public void llenar(int n){
        Scanner lee = new Scanner(System.in);
        System.out.println("Intr datos: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Celular " + i + ": ");
            String marca = lee.nextLine();
            int precio = lee.nextInt();
            int memoria = lee.nextInt();

            lee.nextLine();

            Celular elem = new Celular(marca, precio, memoria);
            this.push(elem);
        }
        //lee.close();
    }


    public int nroElem1(){ //alternativa 1
        return tope + 1;
    }
    public int nroElem2(){ //alternativa 2 mas manual
        PilaCe aux = new PilaCe();
        int c = 0;
        while(!esVacia()){
            Celular elem = pop();
            aux.push(elem);
            c++;
        }
        vaciar(aux);
        return c;
    }
}
