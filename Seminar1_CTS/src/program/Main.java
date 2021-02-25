package program;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo z=new Zoo();
		Giraffe giraffe=new Giraffe("Girafa1");
		Giraffe giraffe2=new Giraffe("Girafa2");
		
		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();

		Zebra zebra=new Zebra("Zebra");
		Zebra zebra2=new Zebra("Zebra2");
		
		z.addAnimal(zebra);
		z.addAnimal(zebra2);
		
		z.feedAllAnimals();
	}

}
