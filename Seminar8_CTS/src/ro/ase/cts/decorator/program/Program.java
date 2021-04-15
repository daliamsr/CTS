package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLMA;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		NotaAbstracta nota=new NotaDePlata(100);
		
		nota.printeaza();
		
		DecoratorAbstract decorator=new DecoratorNotaPasteFericit(nota);
	
		decorator.printeazaFelicitare();
		
		decorator.printeaza();
		
		System.out.println();
		
		DecoratorAbstract decoratorLMA=new DecoratorNotaLMA(nota);
	
		decoratorLMA.printeaza();
		
		//decorare multipla
		NotaAbstracta notaNoua= new NotaDePlata(36);
		DecoratorAbstract decoratorLMANou=new DecoratorNotaLMA(notaNoua);
		DecoratorAbstract decoratorFelicitare= new DecoratorNotaPasteFericit(decoratorLMANou);
		
		System.out.println();
		decoratorFelicitare.printeaza();
	}

}
