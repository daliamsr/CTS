package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSala implements Subject{

	private List<Observer> clienti;
	private String numeSala;
	
	
	public ManagerSala(String numeSala) {
		super();
		this.clienti = new ArrayList<>();
		this.numeSala = numeSala;
	}

	@Override
	public void adaugareAbonat(Observer observer) {
		clienti.add(observer);
		
	}

	@Override
	public void stergeAbonat(Observer observer) {
		clienti.remove(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		clienti.forEach(item -> item.receptioneazaMesaj(mesaj));
		
	}
	public void trimiteAnuntImportant(String tipMeci) {
		trimiteMesaj("Astazi se va juca un meci de " + tipMeci);
	}
}
