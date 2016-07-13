package eightHomework_GeorgiAndreev;

public class Employee extends Person{
	
	private float daySalary;

	public Employee(String name, short age, Gender gender, float daySalary) {
		super(name, age, gender);
		if (daySalary > 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Invalid salary.");
		}
	}

	void showEmployeeInfo() {
		System.out.println("\nEmployee information:");
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("gender: " + this.gender);
		System.out.println("day salary: " + daySalary);
	}
	
	float calculateOvertime(float hours) {
		if (hours < 0) {
			System.out.println("Invalid overtime hours.");
			return 0;
		}
		float moneyForHour = this.daySalary / 8;
		float moneyForOvertimeHour = moneyForHour * 1.5f;
		return moneyForOvertimeHour * hours;
	}
}
