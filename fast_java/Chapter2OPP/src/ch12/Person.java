package ch12;

public class Person {
	
	String name;
	int age;
	public Person()
	{
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void showPerson() {
		System.out.println(name +","+ age);
	}
	
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
	}




}
