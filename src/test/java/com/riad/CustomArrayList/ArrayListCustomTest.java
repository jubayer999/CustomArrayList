package com.riad.CustomArrayList;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class ArrayListCustomTest<E> {
	
	@Test
	public void testObjectAdd() {
		
		Person person=new Person("Riad","1","Uttara");
		ArrayListCustom<Person> arrayListCustom = new ArrayListCustom<Person>().objectAdd(person);
		Person p1=new Person("Riad","1","Uttara");
		assertEquals(p1, arrayListCustom.get(0));
		
	}

	@Test
	public void testGet() {
		
		Person person=new Person("Riad","1","Uttara");
		
		ArrayListCustom<Person> arrayListCustom = new ArrayListCustom<Person>().objectAdd(person);
		
		assertEquals(person.personName, arrayListCustom.get(0).personName);
	
	}

	@Test
	public void testRemove() {
		
		List<Person> personList=new ArrayList<Person>();
		Person p1=new Person("Jubayer","1","Uttara"); 
		  Person p2=new Person("Rahat","2","Dhaka"); 
		  Person p3=new Person("Benajir","3","Mirpur");
		 
		  
		  ArrayListCustom<Person> arrayListCustom1=new ArrayListCustom<Person>().objectAdd(p1);
		  arrayListCustom1.objectAdd(p2);
		  arrayListCustom1.objectAdd(p3);
		  
		  arrayListCustom1=arrayListCustom1.remove(0);

		  personList=Arrays.asList(p1,p2,p3);
		  
		  assertNotEquals(personList.get(0), arrayListCustom1.get(0));
		  assertEquals(personList.get(1),arrayListCustom1.get(0));

	}
	
	@Test
	public void testRemoveAll() {
		
		Person p1=new Person("Jubayer","1","Uttara");
		  Person p2=new Person("Rahat","2","Dhaka");
		  Person p3=new Person("Benajir","3","Mirpur");
		  
		  ArrayListCustom<Person> arrayListCustom2=new ArrayListCustom<Person>().objectAdd(p1); 
		  arrayListCustom2.objectAdd(p2);
		  arrayListCustom2.objectAdd(p3);
		  arrayListCustom2=arrayListCustom2.removeAll();
		  assertEquals(null, arrayListCustom2.get(0));
		  arrayListCustom2.objectAdd(p2);
		  arrayListCustom2.objectAdd(p3);

		
	}


}
