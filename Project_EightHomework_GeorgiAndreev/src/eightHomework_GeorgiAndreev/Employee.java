package eightHomework_GeorgiAndreev;

public class Employee extends Person{
	
	private static final float MULTIPLY_COEF_FOR_OVERTIME_WORKING_HOUR = 1.5f;
	private static final int WORKING_HOURS_IN_A_WORKING_DAY = 8;
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
		if (hours <= 0) {
			System.out.println("Invalid overtime hours.");
			return 0;
		}
		float moneyForHour = this.daySalary / WORKING_HOURS_IN_A_WORKING_DAY;
		float moneyForOvertimeHour = moneyForHour * MULTIPLY_COEF_FOR_OVERTIME_WORKING_HOUR;
		return moneyForOvertimeHour * hours;
	}
}
