package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.dubluri.StubStudent;

public class TestGrupaWithStub {

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateLimitaSuperioara() {
		Grupa grupa=new Grupa(1045);
		IStudent student=new StubStudent();
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	


}