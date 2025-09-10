package Practica.colas.ejer4_1;

public class main {
    public static void main(String[] args){
        Pedido p1 = new Pedido("Luis",11,"Santa cruz");//
        Pedido p2 = new Pedido("Maria",7,"La paz");
        Pedido p3 = new Pedido("Juan",2,"Cochabamba");
        Pedido p4 = new Pedido("Moises",3,"La paz");
        Pedido p5 = new Pedido("Ariel",4,"Pando");
        Pedido p6 = new Pedido("Jose",11,"La paz");//
        Pedido p7 = new Pedido("Alan",11,"Cochabamba");
        Pedido p8 = new Pedido("MAry",4,"Cochabamba");
        Pedido p9 = new Pedido("May",4,"Tarija");
        Pedido p10 = new Pedido("Angela",4,"Tarija");
        Pedido p11 = new Pedido("Alejandro",4,"Cochabamba");

        Cola cola1 = new Cola();

        cola1.push(p1);
        cola1.push(p2);
        cola1.push(p3);
        cola1.push(p4);
        cola1.push(p5);
        cola1.push(p6);
        cola1.push(p7);
        cola1.push(p8);
        cola1.push(p9);
        cola1.push(p10);
        cola1.push(p11);

        cola1.mostrar();
        System.out.println("Nro de elementos: "+cola1.nroElem());
        System.out.println("__A)__");
        verificar(cola1);
        System.out.println("__B)__");
        contPlatillos(cola1);
        System.out.println("__C)__");
        eliminarPedidos(cola1);
        cola1.mostrar();
        System.out.println("__D)__");
        mostrarChapacos(cola1);
    }
    public static void verificar(Cola c){
        Cola aux = new Cola();
        Pedido elem;
        boolean sw = false;
        while(!c.esVacia()){
            elem = c.pop();
            if(elem.getDepOrigen().equals("Pando")){
                sw = true;
            }
            aux.push(elem);
        }
        c.reset();
        c.vaciar(aux);
        if (sw){
            System.out.println("Si existen asistentes de pando");
        }
        else {
            System.out.println("no existen asistentes de pando");
        }
    }
    public static void contPlatillos(Cola c){
        Cola aux = new Cola();
        Pedido elem;
        int cont = 0;
        while(!c.esVacia()){
            elem = c.pop();
            if(elem.getDepOrigen().equals("La paz")){
                cont += elem.getCantPlatillosP() ;
            }
            aux.push(elem);
        }
        c.reset();
        c.vaciar(aux);
        System.out.println("todos los paceños pedieron "+cont+" platillos");
    }
    public static void eliminarPedidos(Cola c){
        Cola aux = new Cola();
        Pedido elem;
        while (!c.esVacia()){
            elem = c.pop();
            if(elem.getCantPlatillosP() > 10 && !elem.getDepOrigen().equals("Cochabamba")){
            }
            else {
                aux.push(elem);
            }

        }
        c.reset();
        c.vaciar(aux);
    }
    public static void mostrarChapacos(Cola c){
        Cola aux = new Cola();
        Pedido elem;
        while (!c.esVacia()){
            elem = c.pop();
            if(elem.getDepOrigen().equals("Tarija")){
                elem.mostrar();
            }
            aux.push(elem);
        }
        c.reset();
        c.vaciar(aux);
    }
}
