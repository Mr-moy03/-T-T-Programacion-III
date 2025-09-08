package COLAS.pdf_1;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String materia;
    private int nota;

    public Estudiante(String nombre,String materia,int nota){
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }

    public static Estudiante leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce el dato: ");
        System.out.println("nombre: ");
        String nombre = lee.nextLine();
        System.out.println("materia: ");
        String materia = lee.nextLine();
        System.out.println("nota: ");
        int nota = lee.nextInt();

        lee.nextLine();

        return new Estudiante(nombre, materia, nota);
    }

    public void mostrar(){
        System.out.println(String.format("Nombre: %s, Materia: %s, Nota:[%d]",this.nombre,this.materia,this.nota));
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getMateria(){
        return this.materia;
    }
    public int getNota(){
        return this.nota;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setNota(int nota){
        this.nota = nota;
    }
}
