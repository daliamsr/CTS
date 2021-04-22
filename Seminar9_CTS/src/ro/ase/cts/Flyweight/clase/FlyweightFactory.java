package ro.ase.cts.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

//cand vrem sa reducem memoria
public class FlyweightFactory {
	private Map<String, Flyweight> clienti;
	
	public FlyweightFactory() {
		super();
		this.clienti = new HashMap<String,Flyweight>();
	}

	public Flyweight getClient( String nrTelefon) {
		Flyweight flyweight=clienti.get(nrTelefon);
		if(flyweight==null) {
			flyweight=new Client("Ion",nrTelefon,"ion@gmail.com");
			clienti.put(nrTelefon, flyweight);
		}
		return flyweight;
	}
}
