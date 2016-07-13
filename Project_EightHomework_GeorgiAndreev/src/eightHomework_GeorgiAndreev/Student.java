package eightHomework_GeorgiAndreev;

public class Student extends Person{
	
	private float score;
	
	/*
	 * public Student() {} - impossible constructor, if parent has 
	 *                        no constructor without parameters
	 *                       (calls parent's constructor without parameters)
	 * 						 so I added constructor without parameters in parent (Peson) 
	 *     
	 */
	
	
	public Student() {
		
	}

	public Student(String name, short age, Gender gender, float score) {
		super(name, age, gender);
		if ((score >= 2) && (score <= 6)) {
			this.score = score;
		} else {
			System.out.println("Invalid score.");
		}
	}
	
	@Override
	void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("person position: student");
		System.out.println("score: " + this.score);
	}

}
