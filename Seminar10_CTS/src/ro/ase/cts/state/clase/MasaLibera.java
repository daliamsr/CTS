package ro.ase.cts.state.clase;

public class MasaLibera implements Stare {

	@Override
	public void modificaStare(Masa masa) {

		if(masa.getStare() instanceof MasaOcupata || masa.getStare() instanceof MasaRezervata) {
			System.out.println("Masa "+masa.getNrMasa()+" este eliberata!");
			masa.setStare(this);
		}else {
			System.out.println("Masa "+masa.getNrMasa()+" este deja libera!");
		}
	}
	
}
