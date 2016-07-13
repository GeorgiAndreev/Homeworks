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

	@Override
	void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("person position: employee");
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
