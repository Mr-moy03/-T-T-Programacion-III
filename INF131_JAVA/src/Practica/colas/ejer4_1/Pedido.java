package Practica.colas.ejer4_1;

public class Pedido {
    //[nombre, cantidad de platillos pedidos, departamento de origen].
    private String nombre;
    private int cantPlatillosP;
    private String depOrigen;
    public Pedido(String nombre, int cantPlatillosP, String depOrigen){
        this.nombre = nombre;
        this.cantPlatillosP = cantPlatillosP;
        this.depOrigen = depOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPlatillosP() {
        return cantPlatillosP;
    }

    public void setCantPlatillosP(int cantPlatillosP) {
        this.cantPlatillosP = cantPlatillosP;
    }

    public String getDepOrigen() {
        return depOrigen;
    }

    public void setDepOrigen(String depOrigen) {
        this.depOrigen = depOrigen;
    }
    public void mostrar(){
        System.out.println(String.format("[Nombre: %s, Cantidad de platillos pedidos: %d, Departamento de origen: %s]",getNombre(),getCantPlatillosP(),getDepOrigen()));
    }
}
