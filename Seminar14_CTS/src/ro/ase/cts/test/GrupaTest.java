package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormalCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class GrupaTest {
	

	@Test
	public void testConstructorCorect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}
	

	@Test
	public void testConstructorLimitaInferioara() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLimitaSuperioara() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void testConstructorAruncaExceptieLimitaInferioara() {
		Grupa grupa=new Grupa(988);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorAruncaExceptieLimitaSuperioara() {
		Grupa grupa=new Grupa(1101);
	}

	@Test(timeout=500)
	@Category(TesteUrgenteCategory.class)
	public void testConstructorPerformanta() {
		Grupa grupa=new Grupa(1084);
	}
	

	@Test
	@Category(TesteNormalCategory.class)
	public void testConstructorExistentaListaStudenti() {
		Grupa grupa=new Grupa(1090);
		assertNotNull(grupa.getStudenti());
	}
	

	@Test
	@Category({GetPromovabilitateCategory.class, TesteNormalCategory.class})
	public void testPromovabilitateCorecta() {
		Grupa grupa=new Grupa(1083);
		//integralisti
		for(int i=0;i<7;i++) {
			Student student=new Student("Ionel");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		//restantieri
		for(int i=0;i<3;i++) {
			Student student=new Student("Marcel");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7f, grupa.getPromovabilitate(),0.1);
	}
	

	@Test
	@Category({GetPromovabilitateCategory.class,TesteUrgenteCategory.class})
	public void testPromovabilitateLowerBoundery() {
		Grupa grupa=new Grupa(1083);
		//integralisti
		for(int i=0;i<7;i++) {
			IStudent student=new Student("Ionel");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(),0.1);
	}
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateUpperBoundery() {
		Grupa grupa=new Grupa(1083);
		//integralisti
		for(int i=0;i<7;i++) {
			IStudent student=new Student("Ionel");
			student.adaugaNota(9);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.1);
	}

	//ErrorConditions
	@Test(expected = IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa=new Grupa(1001);
		grupa.getPromovabilitate();
	}
}