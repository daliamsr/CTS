package ro.ase.cts.SimpleFactory.program;

import ro.ase.cts.SimpleFactory.clase.PersonalSpital;
import ro.ase.cts.SimpleFactory.clase.FactoryPersonal;
import ro.ase.cts.SimpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FactoryPersonal factory=new FactoryPersonal();
		PersonalSpital medic=factory.getPersonal(TipPersonal.MEDIC, "Ana");
		PersonalSpital asistent=factory.getPersonal(TipPersonal.ASISTENT,"Catalin");
		
		System.out.println(medic.toString());
		System.out.println(asistent.toString());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
