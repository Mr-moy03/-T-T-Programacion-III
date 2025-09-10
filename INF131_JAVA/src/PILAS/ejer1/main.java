package PILAS.ejer1;

public class main {
    public static void main(String[] args){
        Pila A = new Pila();
        A.llenar(10);
        A.mostrar();
        System.out.println(A.nroElem());
        A.eli();
        System.out.println(A.nroElem2());
    }
}
