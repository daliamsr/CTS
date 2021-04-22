package ro.ase.cts.strategy.clase;

public class Card implements Strategy {

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Tranzactia a fost efectuata cu cardul pentru suma de "+ suma);
		
	}

}
