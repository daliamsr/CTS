package ro.ase.cts.decorator.clase;

public class DecoratorNotaPasteFericit extends DecoratorAbstract {
	public DecoratorNotaPasteFericit(NotaAbstracta nota) {
		super(nota);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare - Paste Fericit!");
	}
	
	public void printeaza() {
		super.printeaza();
		System.out.println("Paste fericit!");
	}
}
