package ro.ase.cts.strategy.clase;

public class Client {

	private Strategy strategy;
	private String nume;
	public Client(Strategy strategy, String nume) {
		super();
		this.strategy = strategy;
		this.nume = nume;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void platesteNota(float suma) {
		System.out.println(nume+" are de platit "+ suma + "lei!");
		
		strategy.realizeazaPlata(suma);
	}
}
