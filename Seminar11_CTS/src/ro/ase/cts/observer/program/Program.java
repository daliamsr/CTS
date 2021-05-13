package ro.ase.cts.observer.program;





import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Observer;

public class Program {

	public static void main(String[] args) {
	
		ManagerSala managerSala=new ManagerSala("Sala nr 3");
		Observer client1=new Client("Alin");
		Observer client2=new Client("Marius");
		Observer client3=new Client("Ion");
		
		
		managerSala.trimiteAnuntImportant("Fotbal");
		managerSala.trimiteAnuntImportant("Volei");
		managerSala.stergeAbonat(client3);
		managerSala.trimiteAnuntImportant("Handbal");
	}

}
