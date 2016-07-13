package eightHomework_GeorgiAndreev;

public class Student extends Person{
	
	private static final int MAX_SCORE = 6;
	private static final int MIN_SCORE = 2;
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
		if ((score >= MIN_SCORE) && (score <= MAX_SCORE)) {
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
