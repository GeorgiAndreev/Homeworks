package eightHomework_GeorgiAndreev;

public class Person {

	protected String name;
	protected short age;
	protected boolean isMale;
	
	public Person() {
		
	}
	
	public Person(String name, short age, boolean isMale) {
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
		this.isMale = isMale;
	}
	
	void showPersonInfo() {
		System.out.println("\nPerson information:");
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		if (isMale) {
			System.out.println("sex: male");
		} else {
			System.out.println("sex: female");
		}
	}
}
