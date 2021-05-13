package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

	private List<Memento> mementos=new ArrayList<>();
	
	public void adaugaMemento(Memento memento) {
		mementos.add(memento);
	}
	public Memento getMemento(int pozitie) {
		if(pozitie>-1 && pozitie< mementos.size()) {
			return mementos.get(pozitie);
		} else throw new IllegalArgumentException("Pozitie invalida!");
	}
}
