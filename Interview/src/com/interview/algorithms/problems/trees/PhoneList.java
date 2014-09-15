package com.interview.algorithms.problems.trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class PhoneList {
	
	public static void main(String [] args){
		
		Person person1 = new Person(1, "P1.firstname", "p1.lastname");
		Person person2 = new Person(2, "P2.firstname", "p2.lastname");
		Person person3 = new Person(3, "P3.firstname", "p3.lastname");
		Person person4 = new Person(4, "P4.firstname", "p4.lastname");
		Person person5 = new Person(5, "P5.firstname", "p5.lastname");
		Person person6 = new Person(6, "P6.firstname", "p6.lastname");
		Person person7 = new Person(7, "P7.firstname", "p7.lastname");
		
		person1.getContacts().add(person2);
		person1.getContacts().add(person3);
		person2.getContacts().add(person4);
		person2.getContacts().add(person5);
		person3.getContacts().add(person6);
		person3.getContacts().add(person7);
		PhoneList p = new PhoneList();
		//p.getAllContactsOfAPerson(person1);
		Stack<Person> stack = p.getNthLevelContactsOfAPerson(person1, 3);
		while(!stack.isEmpty()){
			System.out.println(stack.pop().getfName());
		}
	}

	
	public Stack<Person> getNthLevelContactsOfAPerson(Person p, int N){
		Map<Integer, Person> personMap = new HashMap<Integer, Person>();
		Stack<Person> currentLevelContacts = new Stack<Person> ();
		Stack<Person> nextLevelContacts = new Stack<Person> ();

		currentLevelContacts.push(p);
		int level = 1;
		while(!currentLevelContacts.isEmpty()){
			Person pers = currentLevelContacts.pop();
			if(personMap.get(pers.getId()) == null){
				personMap.put(pers.getId(), pers);
			}
			for(Person person : pers.getContacts()){
				nextLevelContacts.push(person);
			}
			if(currentLevelContacts.isEmpty()&& !nextLevelContacts.isEmpty()){
				level++ ;
				if(level == N){
					return nextLevelContacts;
				}

				while(!nextLevelContacts.isEmpty()){
					currentLevelContacts.push(nextLevelContacts.pop());
				}
				
			}
			printPerson(pers);
			
		}
		return null;
	}

	
	
	public void getFirstLevelContactsOfAPerson(Person p, int N){
		Map<Integer, Person> personMap = new HashMap<Integer, Person>();
		Deque<Person> personStack = new LinkedList<Person> ();
		personStack.addFirst(p);
		int level = 0;
		while(!personStack.isEmpty()){
			Person pers = personStack.pollLast();
			if(personMap.get(pers.getId()) == null){
				personMap.put(pers.getId(), pers);
			}
			level++ ;
			System.out.println("########");
			for(Person person : pers.getContacts()){
				personStack.push(person);
			}
			printPerson(pers);
			
			level ++;
		}
		
		System.out.println(personMap.size());
	}

	
	//DFS
	public void getAllContactsOfAPerson(Person p){
		Map<Integer, Person> personMap = new HashMap<Integer, Person>();
		Stack<Person> personStack = new Stack<Person> ();
		personStack.push(p);
		
		while(!personStack.isEmpty()){
			Person pers = personStack.pop();
			printPerson(pers);
			if(personMap.get(pers.getId()) == null){
				personMap.put(pers.getId(), pers);
			
				for(Person person : pers.getContacts()){
						personStack.push(person);
				}
			}
			
			
		}
		
		System.out.println(personMap.size());
	}
	
	

	private void printPerson(Person pers) {
		System.out.print(pers.getId()+",");
		System.out.print(pers.getfName() + ",");
		System.out.print(pers.getlName());
		System.out.println("");
	}
	

}


class Person{
	public Person(Integer id, String fname, String lname){
		this.fName = fname;
		this.lName = lname;
		this.id = id;
	}
	private String fName;
	private String lName;
	private Integer id;
	private List<Person> contacts = new ArrayList<Person>();

	public List<Person> getContacts() {
		return contacts;
	}

	public String getfName() {
		return fName;
	}


	public String getlName() {
		return lName;
	}

	public Integer getId() {
		return id;
	}
	
	
}