package Practica.colas.ejer4_2;

public class Estudiante {
    private int ci;
    private String nombre;
    private int cantMateriasIns;
    private double promedio;
    private String carrera;

    public Estudiante(int ci, String nombre,int cantMateriasIns,double promedio,String carrera){
        this.ci = ci;
        this.nombre = nombre;
        this.cantMateriasIns = cantMateriasIns;
        this.promedio = promedio;
        this.carrera = carrera;
    }


    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantMateriasIns() {
        return cantMateriasIns;
    }

    public void setCantMateriasIns(int cantMateriasIns) {
        this.cantMateriasIns = cantMateriasIns;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrar(){
        System.out.println(String.format("[CI: %d, Nombre; %s, Cantidad de materias Inscritas: %d, Promedio: %.2f, Carrera: %s]",
                getCi(),
                getNombre(),
                getCantMateriasIns(),
                getPromedio(),
                getCarrera()));
    }
}
