package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) {
		MeciJucat meci=new MeciJucat("Romania","Spania",10,5,7,10);
		
		ManagerMemento manager=new ManagerMemento();
		manager.adaugaMemento(meci.creareMemento());
		
		meci.setNumeGazda("Italia");
		meci.setNumeOaspeti("Franta");
		meci.setNrSpectatori(33);
		meci.setNrJandarmi(10);
		
		manager.adaugaMemento(meci.creareMemento());
		System.out.println(meci.toString());
		
		meci.setMemento(manager.getMemento(0));
		System.out.println(meci.toString());
	}

}
