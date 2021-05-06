package ro.ase.cts.state.clase;

public class Masa {

	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new MasaLibera();
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public Stare getStare() {
		return stare;
	}

	
	protected void setStare(Stare stare) {
		this.stare = stare;
	}
	public void ocupaMasa() {
		MasaOcupata masaOcupata=new MasaOcupata();
		masaOcupata.modificaStare(this);
	}
	public void rezervaMasa() {
		MasaRezervata masaRezervata=new MasaRezervata();
		masaRezervata.modificaStare(this);
	}
	public void elibereazaMasa() {
		MasaLibera masaLibera=new MasaLibera();
		masaLibera.modificaStare(this);
	}
}
