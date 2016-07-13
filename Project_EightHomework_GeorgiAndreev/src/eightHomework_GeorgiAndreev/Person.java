package eightHomework_GeorgiAndreev;

public class Person {

	protected String name;
	protected short age;
	protected Gender gender;
	
	public Person() {
		
	}
	
	public Person(String name, short age, Gender gender) {
		if ((name != null) && (!name.equals(""))) {
			this.name = name;
		} else {
			System.out.println("Invalid name.");
			this.name = "";
		}
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Invalid age.");
		}
		this.gender = gender;
	}
	
	void showPersonInfo() {
		System.out.println("\nPerson information:");
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("gender: " + this.gender);
	}
}
