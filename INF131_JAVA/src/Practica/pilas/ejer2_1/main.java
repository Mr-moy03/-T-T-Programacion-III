package Practica.pilas.ejer2_1;

public class main {
    public static void main(String[] arg){
        System.out.println("PILA DE CARACTERES");
        System.out.println("Pila 1");
        PilaCaracteres p1 = new PilaCaracteres();
        p1.push('l');
        p1.push('o');
        p1.push('p');
        p1.push('a');
        p1.push('z');
        p1.push('u');
        p1.push('r');

        //p1.mostrar();

        System.out.println("Pila 2");
        PilaCaracteres p2 = new PilaCaracteres();

        p2.push('g');
        p2.push('f');
        p2.push('e');
        p2.push('d');
        p2.push('c');
        p2.push('b');
        p2.push('a');


        //p2.mostrar();

        System.out.println("Pila 3");
        PilaCaracteres p3 = new PilaCaracteres();

        p3.push('a');
        p3.push('b');
        p3.push('c');
        //p3.push('d');
        //p3.push('a');
        //p3.push('a');
        //p3.push('a');


        p3.mostrar();

        //b
        //System.out.println("Cuantas veces aparece x caracteres:"+ xCaracter(p3,'a'));

        //c
        //d
        invertirP(p3);
        p3.mostrar();


    }
    public static void Generador(PilaCaracteres pila1,PilaCaracteres pila2){
        PilaCaracteres aux1 = new PilaCaracteres();
        PilaCaracteres aux2 = new PilaCaracteres();
    }

    public static int xCaracter(PilaCaracteres p,char x){
        PilaCaracteres aux = new PilaCaracteres();
        int cont = 0;
        while (!p.esVacia()){
            char elem = p.pop();
            if(elem == x){
                cont++;
            }
            aux.push(elem);
        }
        p.vaciar(aux);
        return cont;
    }
    public static void invertirP(PilaCaracteres p){
        PilaCaracteres aux1 = new PilaCaracteres();
        PilaCaracteres aux2 = new PilaCaracteres();
        aux1.vaciar(p);
        aux2.vaciar(aux1);
        p.vaciar(aux2);
        //p.mostrar();
    }
}
