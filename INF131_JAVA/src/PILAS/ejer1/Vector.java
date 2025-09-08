package PILAS.ejer1;

public class Vector {
    private int max;
    private String[] v;
    public Vector(){
        this.max = 10;
        this.v = new String[this.max];
    }
    public Vector(int max){
        this.max = max;
        this.v = new String[this.max];
    }

    public int getMax(){
        return this.max;
    }
    public String[] getV(){
        return this.v;
    }
}
