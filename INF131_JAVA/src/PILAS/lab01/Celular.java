package PILAS.lab01;

public class Celular {
    private String marca;
    private int precio;
    private int memoria;
    public Celular(String marca,int precio,int memoria){
        this.marca = marca;
        this.precio = precio;
        this.memoria = memoria;
    }
    public String getMarca(){
        return this.marca;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int getMemoria(){
        return this.memoria;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public void setPrecio(int p){
        this.precio = p;
    }

    public void setMemoria(int m){
        this.memoria = m;
    }


    public void mostrar(){
        System.out.println(String.format("Marca: %s , precio: %d , memoria: %d",marca,precio,memoria));
    }

    //leer()
}
