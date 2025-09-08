package PILAS.lab01_1;
import java.util.*;
public class Agenda {
    private String nom;
    private int nroctos;
    private int MAX = 50;
    private Contacto[] v = new Contacto[MAX];

    public Agenda(String nom) {
    	this.nom = nom;
    }
    public Agenda(String nom,int nroctos) {
        this.nom = nom;
        this.nroctos = nroctos;
    }
    public String getNom() { 
    	return nom; 
    }
    public int getNroctos() { 
    	return nroctos; 
    }

    public Contacto[] getV() {
        return v;
    }

    public void setNom(String nom) { 
    	this.nom = nom; 
    }
    
    public void setNroCtos(int nroctos) { 
    	this.nroctos = nroctos; 
    }
  

    public void addContacto(Contacto c) {
        if (nroctos < MAX)
            v[nroctos++] = c;
    }
    public void mostrar() {
        System.out.printf("[Agenda: %s | contactos: %d]\n", nom, nroctos);
        for (int i = 0; i < nroctos; i++)
            v[i].mostrar();
    }

}



