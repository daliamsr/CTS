package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.MasaLibera;

public class Program {

	public static void main(String[] args) {

		Masa masa=new Masa(3);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		//masa.setStare(new MasaLibera());
		masa.rezervaMasa();
		
		masa.ocupaMasa();
		masa.elibereazaMasa();

	}

}
