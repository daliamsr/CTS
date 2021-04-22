package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare r1=new Rezervare(5,3,17);
		Rezervare r2=new Rezervare(4,2,18);
		Rezervare r3=new Rezervare(2,7,19);
		
		FlyweightFactory fabrica=new FlyweightFactory();
		
		fabrica.getClient("07111111").printeazaRezervare(r1);
		fabrica.getClient("07222222").printeazaRezervare(r2);
		fabrica.getClient("07111111").printeazaRezervare(r3);
		

	}

}
