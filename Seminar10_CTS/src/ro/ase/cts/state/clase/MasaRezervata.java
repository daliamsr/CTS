package ro.ase.cts.state.clase;

public class MasaRezervata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaLibera ) {
			System.out.println("Masa "+masa.getNrMasa()+" este rezervata!");
			masa.setStare(this);
		}else {
			System.out.println("Masa "+masa.getNrMasa()+" este deja rezervata!");
		}
		
	}

}
