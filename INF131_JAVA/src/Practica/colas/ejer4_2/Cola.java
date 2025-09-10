package Practica.colas.ejer4_2;
public class Cola {
    private int max = 50;
    private Estudiante v[] = new Estudiante[max];
    private int inicio;
    private int fin;
    public Cola(){
        this.inicio = -1;
        this.fin = -1;
    }

    public boolean esVacia(){
        return this.inicio == this.fin;
    }

    public boolean esLlena(){
        return this.fin == this.max - 1;
    }

    public void push (Estudiante elem){
        if(esLlena()){
            System.out.println("cola llena");
        }
        else{
            this.fin++;
            this.v[this.fin] = elem;
        }
    }

    public Estudiante pop (){
        Estudiante elem = null;
        if(esVacia()){
            System.out.println("cola vacia");
        }
        else{
            this.inicio++;
            elem = this.v[this.inicio];
        }
        return elem;
    }
    public int nroElem(){
        return this.fin - this.inicio;
    }

    public void vaciar(Cola c){
        while (!c.esVacia()){
            push(c.pop());
        }
    }
    // llenar()

    public void mostrar(){
        Cola aux = new Cola();
        Estudiante x;
        while (!esVacia()){
            x = pop();
            x.mostrar();
            aux.push(x);
        }
        vaciar(aux);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        Cola aux = new Cola();
        Estudiante x;
        while (!esVacia()){
            x = pop();
            str.append(x).append("\n");
            aux.push(x);
        }
        vaciar(aux);
        return str.toString();
    }
    public void reset(){
        this.inicio = -1;
        this.fin = -1;
    }

}

