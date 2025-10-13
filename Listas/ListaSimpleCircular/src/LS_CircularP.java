import java.util.Scanner;

//LS_CircularP.java
public class LS_CircularP extends ListaSimpleP{
    public LS_CircularP(){
        super();
    }

    public boolean esVacia(){
        return  (P == null);
    }
    public int nroNodos(){
        int c = 0;
        if (P != null){
            NodoP R = P;
            while (R.getSig() != P){
                c++;
                R = R.getSig();
            }
            c++;
        }
        return c;
    }

    public void adiFinal(String nom, int edad){
        NodoP nuevo = new NodoP();
        nuevo.setNom(nom);
        nuevo.setEdad(edad);
        if (P == null) {
            P = nuevo;
            P.setSig(P);
        }
        else {
            NodoP R = P;
            while(R.getSig() != P){
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
        }
    }

    public void mostrar(){
        NodoP R = P;
        while (R.getSig() != P){
            System.out.println(R.getNom() + R.getEdad());
            R = R.getSig();
        }
    }

    public void adiPrincipio(String nom,int edad){
        NodoP nuevo = new NodoP();
        nuevo.setNom(nom);
        nuevo.setEdad(edad);
        if (P == null){
            P = nuevo;
            P.setSig(P);
        }
        else {
            NodoP R = P;
            while (R.getSig() != P){
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setSig(P);
            P = nuevo;
        }
    }

    public NodoP eliPrincipio(){
        NodoP x = new NodoP();
        if (P.getSig() == P){
            x = P;
            x.setSig(null);
            P = null;
        }
        else {
            x = P;
            P = P.getSig();
            NodoP R = P;
            while (R.getSig() != P){
                R = R.getSig();
            }
            R.setSig(P);
            x.setSig(null);
        }
        return x;
    }

    public NodoP eliFinal() {
        // Nodo que vamos a eliminar y devolver.
        NodoP x;

        // Caso 1: La lista está vacía o tiene un solo nodo.
        // Si P.getSig() == P, significa que el único nodo se apunta a sí mismo.
        if (P.getSig() == P) {
            x = P;        // Guardamos el nodo a eliminar.
            P = null;     // La lista ahora está vacía.
            x.setSig(null); // Rompemos el enlace del nodo eliminado.
            return x;
        } else {
            // Caso 2: La lista tiene múltiples nodos.
            // Necesitamos dos punteros para encontrar el penúltimo nodo.
            NodoP R = P; // 'R' será el puntero que recorre la lista.
            NodoP S = P; // 'S' será el puntero que se queda un paso atrás de R.

            // Avanzamos 'R' hasta que sea el último nodo.
            // El último nodo es aquel cuyo siguiente es P.
            while (R.getSig() != P) {
                S = R;          // 'S' toma la posición actual de 'R'.
                R = R.getSig(); // 'R' avanza al siguiente.
            }

            // Al salir del bucle:
            // R -> es el último nodo (el que queremos eliminar).
            // S -> es el penúltimo nodo.

            x = R;              // Guardamos el nodo a eliminar.
            S.setSig(P);        // Hacemos que el penúltimo nodo (S) ahora apunte al primero (P), cerrando el círculo.
            x.setSig(null);     // Rompemos el enlace del nodo eliminado.
            return x;
        }
    }

    public void llenar1(int n) {
        // Creamos un objeto Scanner para leer desde el teclado
        Scanner lee = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese los datos de la persona #" + i);

            // 1. Leemos el nombre
            System.out.print("Nombre: ");
            String nom = lee.next();

            // 2. Leemos la edad
            System.out.print("Edad: ");
            int edad = lee.nextInt();

            // 3. Añadimos los datos leídos al final de la lista
            adiFinal(nom, edad);
        }
    }

    public void llenar2(int n) {
        // Creamos un objeto Scanner
        Scanner lee = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese los datos de la persona #" + i);

            // 1. Leemos el nombre
            System.out.print("Nombre: ");
            String nom = lee.next();

            // 2. Leemos la edad
            System.out.print("Edad: ");
            int edad = lee.nextInt();

            // 3. Añadimos los datos leídos al principio de la lista
            adiPrincipio(nom, edad);
        }
    }
}
