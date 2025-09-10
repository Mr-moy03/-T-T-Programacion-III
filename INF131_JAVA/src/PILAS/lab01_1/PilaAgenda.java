package PILAS.lab01_1;
import java.util.Scanner;

public class PilaAgenda {
    private int tope;
    private int max = 50;
    private Agenda v[] = new Agenda[max];

    public PilaAgenda(){
        this.tope = -1;
    }
    public boolean esVacia(){
        return (tope == -1);
    }

    public boolean esLlena(){
        return (tope == max-1);
    }
    public void push(Agenda c){ //adiccionar
        if(!esLlena()){
            tope++;
            v[tope] = c;
        }
        else{
            System.out.println("Pila llena");
        }
    }

    public Agenda pop(){ //eliminar
        Agenda elem = null;
        if(!esVacia()){ //si la pila no es vacia
            elem = this.v[this.tope];
            this.tope--; //decrementamos en una unidad
        }
        else
            System.out.println("Pila es vacia!!!!");
        return elem;
    }
    public void mostrar(){
        PilaAgenda aux = new PilaAgenda();
        while (!esVacia()){
            Agenda x = pop();
            x.mostrar();
            aux.push(x);
        }
        vaciar(aux);
    }

    public void vaciar(PilaAgenda p){
        while(!p.esVacia()){  //mientras la pila p NO es vacia
            this.push(p.pop());
        }
    }

    public void llenar(int n){
        Scanner lee = new Scanner(System.in);
        System.out.println("Intr datos: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Agenda " + i + ": ");
            String nom = lee.nextLine();
            lee.nextLine();
            Agenda elem = new Agenda(nom);
            this.push(elem);
        }
    }

    
    public int nroElem1(){ //alternativa 1
        return tope + 1;
    }

    public int nroElem2(){ //alternativa 2 mas manual
        PilaAgenda aux = new PilaAgenda();
        int c = 0;
        while(!esVacia()){
            Agenda elem = pop();
            aux.push(elem);
            c++;
        }
        vaciar(aux);
        return c;
    }
}
