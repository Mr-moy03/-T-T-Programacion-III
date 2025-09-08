package PILAS.ejer1;
import java.util.Scanner;

public class Pila extends Vector{
    private int tope;
    public Pila(){
        super();
        this.tope = -1;
    }

    public Pila(int n){
        super(n);
        this.tope = -1;
    }
    public boolean esVacia(){
        if(this.tope == -1){
            return true;
        }
        return false;
    }

    public boolean esLlena(){
        if(this.tope == getMax() - 1){
            return true;
        }
        return false;
    }

    public void adi(String elem){
        if(!esLlena()){
            this.tope++;
            getV()[tope] = elem;
        }
        else{
            System.out.println("Pila llena");
        }
    }

    public String eli(){
        String elem;
        if(!esVacia()){
            elem = getV()[tope];
            tope--;
        }else{
            System.out.println("Pila Vacia");
            return null;
        }
        return elem;
    }

    public int nroElem(){
        return tope + 1;
    }

    public int nroElem2(){
        Pila aux = new Pila();
        int c = 0;
        while(!esVacia()){
            aux.adi(eli());
            c++;
        }
        vaciar(aux);
        return c;
    }

    public void vaciar(Pila p){
        while(!p.esVacia()){
            adi(p.eli());
        }
    }

    public void llenar(int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++){
            String x = sc.nextLine();
            adi(x);
        }
    }

    public void mostrar(){
        Pila aux = new Pila();
        while(!esVacia()){
            String x = eli();
            System.out.println(x);
            aux.adi(x);
        }
        vaciar(aux);
    }

}
