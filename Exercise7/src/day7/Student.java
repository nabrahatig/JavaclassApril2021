
package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	private String firstName;

	private int age;

	// object
	//*
	 /* students.add(new Student("Negisti", 28)); students.add(new Student("Marta",
	 * 20)); students.add(new Student("Lulu", 15));
	 */

	public static void main(String[] args) {

		Student obj1 = new Student("Negisti", 28);
		Student obj2 = new Student("Rahwa", 10);
		Student obj3 = new Student("Marta", 20);

		List<Student> students = new ArrayList<Student>();
		
		students.add(obj1);
		students.add(obj2);
		students.add(obj3);

		System.out.println(students);

		Collections.sort(students);

		System.out.println(students);

	}
	//Constructor 

	public Student(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	//Getter setter here\
	//member variable
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(o.firstName);
		

	}

}
