package com.riad.CustomArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;



class ArrayListCustom<E> {
	   
	   private  final int INITIAL_CAPACITY = 10;
	   private int size = 0;
	   public  Object elementData[] = {};

	   public ArrayListCustom() {
		   
		   elementData = new Object[INITIAL_CAPACITY];

	   }

	   public ArrayListCustom<E> objectAdd(E e) {
		   if (size == elementData.length) {
			   ensureCapacity(); 
		   }
		   elementData[size++] = e;
		   
		   return this;
	   }
	   
	   @SuppressWarnings("unchecked")
	   public E get(int index) {

	  
	   return (E) elementData[index]; 
	   
	   }
	 
	   public ArrayListCustom<E> remove(int index) {

		   if (index < 0 || index >= size) {
			   throw new IndexOutOfBoundsException("Index: " + index + ", Size "
			   + index);
			   }

	      
		   for (int i = index; i < size - 1; i++) {
		   elementData[i] = elementData[i + 1];
		   }
		   size--; 
		   return this;

	   }
	   
	   public ArrayListCustom<E> removeAll() {

			   elementData = new Object[INITIAL_CAPACITY];
		 size=0;
		   return this;
		   
	   }
	  
	   private void ensureCapacity() {
	   int newIncreasedCapacity = elementData.length * 2;
	   elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	   }

	   public void display() {
		   
	   System.out.print("Displaying list : ");
	   
	   
		   for (int i = 0; i < size; i++) {
			   
		   System.out.print(elementData[i] + " ");
		   
		   }

	   }
	   
	   
	   
	 
	}


