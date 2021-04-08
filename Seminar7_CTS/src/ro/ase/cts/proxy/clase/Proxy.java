package ro.ase.cts.proxy.clase;

//PROXY doar atunci cand ti se pune o conditie astfel incat sa fie mai putin chestii
public class Proxy implements CreditAbstract{
	private CreditAbstract credit;
	
	public Proxy(CreditAbstract credit) {
		super();
		this.credit = credit;
	}


	@Override
	public void OferaCredit(TipMoneda tip, float suma) {
		if(tip==TipMoneda.RON) {
			credit.OferaCredit(tip, suma);
		}
		else {
			System.out.println("Banca nu mai ofera credite in alte monede!");
		}
		
	}

}
