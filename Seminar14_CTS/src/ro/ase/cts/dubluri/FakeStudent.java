package ro.ase.cts.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class FakeStudent implements IStudent {
	String nume;
	float medie;
	int nota;
	boolean areRestante;
	
	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return nume;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void setAreRestante(boolean areRestante) {
		this.areRestante = areRestante;
	}

	@Override
	public void setNume(String nume) {
		this.nume=nume;
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return nota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestante;
	}

}
