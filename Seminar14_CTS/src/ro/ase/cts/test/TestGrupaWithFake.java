package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.dubluri.FakeStudent;

public class TestGrupaWithFake {

	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateRight() {
		Grupa grupa=new Grupa(1056);
		for(int i=0; i<8;i++) {
			FakeStudent student=new FakeStudent();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2;i++) {
			FakeStudent student=new FakeStudent();
			student.setAreRestante(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	}

}