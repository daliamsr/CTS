package ro.ase.cts.adapterProgram.program;



import ro.ase.cts.adapterClase.clase.AdaptorCreditClase;
import ro.ase.cts.adapterClase.clase.CreditAbstract;

//adapter de clase atunci cand ai interfata
//adapter de obiecte cand ai clasa abstracta
public class Main {


	public static void afiseazaInformatiiCredit(CreditAbstract credit)  {
		credit.oferaCredit();
	}


	public static void main(String[] args) {
		
		AdaptorCreditClase adaptorClase = new AdaptorCreditClase(50, "Ana");
		afiseazaInformatiiCredit(adaptorClase);

	}

}
