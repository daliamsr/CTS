package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;

//in main nu mai tb sa folosim celelalte clase, ci doar facade
public class Main {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("2991220112233","Andreea");
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Oferim credit");
		}
		else {
			System.out.println("Nu oferim credit");
		}

	}

}
