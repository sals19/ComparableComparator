
/*
 * Class name : Person
 * 
 * Version Info : Version 1
 * 
 * Copyright Notice : None
 * 
 */


package CompareTesting;

public class Person implements Comparable<Person> {
	
	private int age;
	private String name;
	
	Person(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		if (this.age == o.age)
			return 0;
		else if (this.age > o.age) 
			return 1;
		else 
			return -1;
	}

}
