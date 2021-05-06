package ro.ase.cts.chain.clase;

public class ContEconomii extends Cont {

	public ContEconomii(float sold) {
		super(sold);
	}

	@Override
	public void plateste(float suma) {
		if(suma>super.getSold()) {
			System.out.println("Ai platit cu contul de economii!");
			super.setSold(super.getSold()-suma);
		}else
		{
			if(super.getSuccesor()==null) {
				System.out.println("Nu se poate efectua plata!");
			} else {
				super.getSuccesor().plateste(suma);
			}
		}
	}
}
