package ro.ase.cts.SimpleFactory.clase;



//SIMPLE FACTORY
//->avem enum=>simple factory
//->folosim FACTORY cand avem familie de clase
//->folosim simple factory atunci cand nu ne itnereseaza daca incalcam 
//principiul OPEN/CLOSED (pt ca atunci cand modific intr-un loc(tipPersona), tb modificat peste tot(FactoryPersonal+adaugat clase))
public class FactoryPersonal {

	public PersonalSpital getPersonal(TipPersonal tipPersonal, String nume) throws Exception {
		switch (tipPersonal) {
		case MEDIC: {
			Medic medic = new Medic(nume);
			return medic;
		}
		case ASISTENT: {
			Asistent asistent = new Asistent(nume);
			return asistent;
		}
		case BRANCARDIER:
			return new Brancardier(nume);
		default:
			throw new Exception();
		}

	}
}
