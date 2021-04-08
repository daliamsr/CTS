package ro.ase.cts.adapterClase.clase;

public class AdaptorCreditClase extends Leasing implements CreditAbstract {

	public AdaptorCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
		
	}

	@Override
	public void oferaCredit() {
		
		super.imprumuta();
		
	}

}
