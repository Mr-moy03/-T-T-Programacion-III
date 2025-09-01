package PILAS.cv_ejer_1;
import java.util.Scanner;


public class PilaCadenas extends VectorCadenas {
	private int tope;

	public PilaCadenas() {
		this.tope = -1;
	}
	
	public boolean esVacia(){
		if(this.tope == -1)
			return true;  //pila vacia
		else
			return false; //pila no es vacia
	}
	public boolean esLlena(){
		if(this.tope == max-1)
			return true;  //pila llena
		else 
			return false; //pila no es llena
	}
	public void adi(String elem){ //push
		if(!esLlena()){ //si la pila no es llena //verificamos si noesta llena
			this.tope++;  //incrementa en una unidad  tope = tope + 1
			this.v[this.tope] = elem;
		}
		else
			System.out.println("Pila Llena!!!");
	}
	public String eli(){ //pop
		String elem = "";
		if(!esVacia()){ //si la pila no es vacia
			elem = this.v[this.tope];
			this.tope--; //decrementamos en una unidad
		}
		else
			System.out.println("Pila es vacia!!!!");
		return elem;
	}
	
	public void mostrar(){
		PilaCadenas aux = new PilaCadenas();
		System.out.println("Datos de la pila: ");
		while(!esVacia()){
			String elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		} 
		vaciar(aux);
	}
	public void vaciar(PilaCadenas p){
		while(!p.esVacia()){  //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	public void llenar(int n){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr datos: ");
		for (int i = 1; i <= n; i++) {
			String elem = lee.next();
			this.adi(elem);
		}
	}
	public int nroElem(){
		return tope + 1;
	}
	public int NroElem(){
		PilaCadenas aux = new PilaCadenas();
		int c = 0;
		while(!esVacia()){
			String elem = eli();
			aux.adi(elem);
			c++;
		} 
		vaciar(aux);
		return c;
	}
}
