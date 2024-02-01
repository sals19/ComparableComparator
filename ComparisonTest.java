package CompareTesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparisonTest {
	
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(20, "Gita"));
		persons.add(new Person(30, "Sita"));
		persons.add(new Person(15, "Rahul"));
		persons.add(new Person(35, "Abhinav"));
		
		Collections.sort(persons);
		for(Person per : persons) {
			System.out.println("Name : "+per.getName()+" , Age : "+per.getAge());
		}
		System.out.println("--------------");
		Collections.sort(persons, (Person o1, Person o2) -> Integer.compare(o2.getAge(), o1.getAge()));
		
		for(Person per : persons) {
			System.out.println("Name : "+per.getName()+" , Age : "+per.getAge());
		}
		System.out.println("--------------");
		Collections.sort(persons, (Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));
		
		for(Person per : persons) {
			System.out.println("Name : "+per.getName()+" , Age : "+per.getAge());
		}
		System.out.println("--------------");
		Collections.sort(persons, (Person o1, Person o2) -> o2.getName().compareTo(o1.getName()));
		
		for(Person per : persons) {
			System.out.println("Name : "+per.getName()+" , Age : "+per.getAge());
		}
		
	}
	

}
