package PILAS.lab01_1;

public class Contacto {
	private String nom;
	private int nroCel;
	
	public Contacto(String nom,int nroCel) {
		this.nom = nom; 
		this.nroCel = nroCel;
	}
	
	public void mostrar() {
		System.out.println(String.format("--> Nombre: %s | Nro Celular: %d", this.nom,this.nroCel));
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNroCel() {
		return this.nroCel;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNroCel(int nroCel) {
		this.nroCel = nroCel;
	}

}
