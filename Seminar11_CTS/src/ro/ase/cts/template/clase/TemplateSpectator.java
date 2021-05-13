package ro.ase.cts.template.clase;

public abstract class TemplateSpectator {

	public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seFaceControlCorporal();
	public abstract void ocupaLocul();
	
	//e musai sa fie final, ca altfel nu e template
	public final void intrarePeStadion() {
		seAseazaLaCoada();
		prezintaBiletul();
		seFaceControlCorporal();
		ocupaLocul();
	}
}
