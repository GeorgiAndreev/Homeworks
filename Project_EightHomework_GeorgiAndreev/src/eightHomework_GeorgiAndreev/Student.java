package eightHomework_GeorgiAndreev;

public class Student extends Person{
	
	private float score;
	
	/*
	 * public Student() {} - impossible constructor, 
	 *                       must call parent's constructor without parameters
	 * 						 (parent must have constructor without parameters) 
	 *                       using super(); 
	 */
	
	
	public Student() {
		super();
	}

	public Student(String name, short age, boolean isMale, float score) {
		super(name, age, isMale);
		if ((score >= 2) && (score <= 6)) {
			this.score = score;
		} else {
			System.out.println("Invalid score.");
		}
	}
	
	void showStudentInfo() {
		System.out.println("\nStudent information:");
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		if (isMale) {
			System.out.println("sex: male");
		} else {
			System.out.println("sex: female");
		}
		System.out.println("score: " + this.score);
	}

}
