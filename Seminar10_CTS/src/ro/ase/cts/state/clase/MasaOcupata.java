package ro.ase.cts.state.clase;

public class MasaOcupata implements Stare {

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof MasaOcupata) {
			System.out.println("Masa "+masa.getNrMasa()+" nu se poate ocupa!");
		}else {
			masa.setStare(this);
			System.out.println("Masa "+masa.getNrMasa()+" este trecuta in starea ocupata!");
		}
		
	}

}
