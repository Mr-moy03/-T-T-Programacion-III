package COLAS._ejercicio;

import java.util.Scanner;

public class Jugete {
    private String nombre;
    private String tipo;
    private int nivelDes;
    private String dueñoAnt;

    public Jugete(String nombre,String tipo,int nivelDes,String dueñoAnt){
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelDes = nivelDes;
        this.dueñoAnt = dueñoAnt;
    }
    public static Jugete leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce el dato: ");
        System.out.println("nombre: ");
        String nombre = lee.nextLine();
        System.out.println("materia: ");
        String materia = lee.nextLine();
        System.out.println("nota: ");
        int nota = lee.nextInt();
        
        System.out.println("nota: ");
        String dueñoAnt = lee.nextLine();

        lee.nextLine();

        return new Jugete(nombre, materia, nota,dueñoAnt);
    }

    public void mostrar(){
        System.out.println(String.format("Jugete -> [Nombre: %s, Tipo: %s, Nivel de desgaste: %d, Dueño anterior: %s]",this.nombre,this.tipo,this.nivelDes,this.dueñoAnt));
    }
    @Override
    public String toString() {
    	return String.format("Jugete -> [Nombre: %s, Tipo: %s, Nivel de desgaste: %d]",this.nombre,this.tipo,this.nivelDes);
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivelDes() {
		return nivelDes;
	}

	public void setNivelDes(int nivelDes) {
		this.nivelDes = nivelDes;
	}

	public String getDueñoAnt() {
		return dueñoAnt;
	}

	public void setDueñoAnt(String dueño) {
		this.dueñoAnt = dueño;
	}
}
