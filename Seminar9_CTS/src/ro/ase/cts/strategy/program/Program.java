package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.Portofel;
import ro.ase.cts.strategy.clase.Strategy;

public class Program {

	public static void main(String[] args) {
		Strategy portofel=new Portofel(200);
		Strategy card=new Card();
		Client c1=new Client(portofel,"Alin");
		
		c1.platesteNota(100);
		c1.setStrategy(card);
		c1.platesteNota(300);
		c1.setStrategy(portofel);
		c1.platesteNota(500);
	}
}
