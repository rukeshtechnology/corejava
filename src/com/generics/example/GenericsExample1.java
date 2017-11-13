package com.generics.example;

import java.util.ArrayList;

public class GenericsExample1 {

	public static void main(String[] args) {
		GenericsExample1 example1 = new GenericsExample1();
		
		//method 1
		example1.addToList();
		
		//method 2
		ArrayList<User> arrayList = new ArrayList<>();
		example1.addToList2(arrayList);
		
		//method 3
		example1.addToList3();
	}
	
	/**
	 * Giving type safety. This is Generic type not raw type. 
	 * Use with ArrayList
	 */	
	public void addToList() {	
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Rukesh");
		myList.add("Mira");
		
		//Another way to write it
		ArrayList<String> myList2 = new ArrayList<>();
		myList.add("Savannah");		
	}
	
	/**
	 * Using in argument/parameter
	 */
	public void addToList2(ArrayList<User> users) {
		System.out.println();		
	}
	
	public void  addToList3() {
		ArrayList rawList = new ArrayList<>();
		ArrayList<Object> objectList = new ArrayList<>();
		ArrayList<User> userList = new ArrayList<>();
		
		addToList2(rawList);		
		addToList2(userList);		
		/**
		 * addToList2(objectList); This gives compilation problem. Only accept raw and userList as an argument.
		 * 
		 * Also below all is of type java.util.ArrayList 
		 */
		
		System.out.println("rawList class is " + rawList.getClass());
		System.out.println("objectList class is " + objectList.getClass());
		System.out.println("userList class is " + userList.getClass());
	}
}