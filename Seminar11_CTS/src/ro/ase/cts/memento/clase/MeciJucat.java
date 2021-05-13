package ro.ase.cts.memento.clase;

public class MeciJucat {

	private String numeGazda;
	private String numeOaspeti;
	private int nrSpectatori;
	private int nrbilete;
	private int nrSticle;
	private int nrJandarmi;
	public MeciJucat(String numeGazda, String numeOaspeti, int nrSpectatori, int nrbilete, int nrSticle,
			int nrJandarmi) {
		super();
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrbilete = nrbilete;
		this.nrSticle = nrSticle;
		this.nrJandarmi = nrJandarmi;
	}
	public String getNumeGazda() {
		return numeGazda;
	}
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	public String getNumeOaspeti() {
		return numeOaspeti;
	}
	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public int getNrbilete() {
		return nrbilete;
	}
	public void setNrbilete(int nrbilete) {
		this.nrbilete = nrbilete;
	}
	public int getNrSticle() {
		return nrSticle;
	}
	public void setNrSticle(int nrSticle) {
		this.nrSticle = nrSticle;
	}
	public int getNrJandarmi() {
		return nrJandarmi;
	}
	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [numeGazda=");
		builder.append(numeGazda);
		builder.append(", numeOaspeti=");
		builder.append(numeOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrbilete=");
		builder.append(nrbilete);
		builder.append(", nrSticle=");
		builder.append(nrSticle);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	public Memento creareMemento() {
		Memento memento=new Memento(numeOaspeti, numeGazda, nrSpectatori);
		return memento;
		
	}
	public void setMemento(Memento memento) {
		nrSpectatori=memento.getNrSpectatori();
		numeGazda=memento.getNumeGazda();
		numeOaspeti=memento.getNumeOaspeti();
	}
}
