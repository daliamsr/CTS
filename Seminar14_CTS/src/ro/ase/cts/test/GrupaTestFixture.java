package ro.ase.cts.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTestFixture {

	private Grupa grupa;

	// JUnit4-> Before, 3->Setup
	@Before
	public void setup() {
		grupa = new Grupa(1038);
		for (int i = 0; i < 35; i++) {
			Student student = new Student("Ionel");
			for (int j = 0; j < 7; j++) {
				student.adaugaNota(8);
			}
			grupa.adaugaStudent(student);
		}
	}

	// Performance
	@Test(timeout = 500)
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}