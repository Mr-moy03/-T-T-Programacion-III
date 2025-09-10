package COLAS.enClase.ejemplo_1;

public class ColaSimplePersona {
    private int max = 50;
    private Persona v[] = new Persona[max];
    private int inicio;
    private int fin;
    public ColaSimplePersona(){
        this.inicio = -1;
        this.fin = -1;
    }

    public boolean esVacia(){
        return this.inicio == this.fin;
    }

    public boolean esLlena(){
        return this.fin == this.max - 1;
    }

    public void push (Persona elem){
        if(esLlena()){
            System.out.println("cola llena");
        }
        else{
            this.fin++;
            this.v[this.fin] = elem;
        }
    }

    public Persona pop (){
        Persona elem = null;
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

    public void vaciar(ColaSimplePersona c){
        while (!c.esVacia()){
            push(c.pop());
        }
    }
    // llenar()

    public void mostrar(){
        ColaSimplePersona aux = new ColaSimplePersona();
        Persona x;
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
        ColaSimplePersona aux = new ColaSimplePersona();
        Persona x;
        while (!esVacia()){
            x = pop();
            str.append(x+"\n");
            aux.push(x);
        }
        vaciar(aux);
        return str.toString();
    }

}
