package Practica.pilas.ejer2_1;

public class PilaCaracteres {
    private int max = 50;
    private char v[] = new char[max];
    private int tope;

    public PilaCaracteres(){
        this.tope = -1;
    }

    public boolean esVacia(){
        return this.tope == -1;
    }

    public boolean esLlena(){
        return this.tope == this.max - 1;
    }

    public void push(char elem){
        if (!esLlena()){
            this.tope++;
            this.v[this.tope] = elem;

        }
        else{
            System.out.println("Pila llena");
        }
    }

    public char pop(){
        char elem = 0;
        if(!esVacia()){
            elem = this.v[this.tope];
            this.tope--;
        }
        else{
            System.out.println("Pila Vacia");
        }
        return elem;
    }
    public void mostrar(){
        PilaCaracteres aux = new PilaCaracteres();
        System.out.println("Datos de la pila: ");
        while(!esVacia()){
            char elem = pop();
            System.out.println(elem);
            aux.push(elem);
        }
        vaciar(aux);
    }

    public void vaciar(PilaCaracteres p){
        while(!p.esVacia()){
            this.push(p.pop());
        }
    }

    public int nroElem(){
        return this.tope + 1;
    }
}
