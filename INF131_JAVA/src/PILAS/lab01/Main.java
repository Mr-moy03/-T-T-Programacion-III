package PILAS.lab01;

public class Main {
    public static void main(String[] args){
        PilaCe A = new PilaCe();
        A.llenar(4);
        //A.mostrar();


        //b) procedimiento
        agruparCeMarca(A);
        A.mostrar();
        //c) funcion
        System.out.println(contaCeMem(A,250));

    }

    private static int contaCeMem(PilaCe A, int y) {
        PilaCe aux = new PilaCe();
        int cnt = 0;
        while(!A.esVacia()){
            Celular x = A.pop();
            if (x.getMemoria() >= y){
                cnt ++;
            }
            aux.push(x);
        }
        A.vaciar(aux);
        return cnt;
    }

    private static void agruparCeMarca(PilaCe A) {
        //PilaCe aux,ag = new PilaCe();
        PilaCe aux = new PilaCe();
        PilaCe ag = new PilaCe();
        while (!A.esVacia()){
            Celular x = A.pop();
            while(!A.esVacia()){
                Celular y = A.pop();
                if (x.getMarca() == y.getMarca()){
                    ag.push(y);
                }
                else{
                    aux.push(y);
                }
            }
            ag.push(x);
            A.vaciar(aux);
        }
        A.vaciar(ag);
    }

}
