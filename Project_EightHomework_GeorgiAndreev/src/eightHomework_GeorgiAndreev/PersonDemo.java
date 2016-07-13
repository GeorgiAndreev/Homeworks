package eightHomework_GeorgiAndreev;

public class PersonDemo {

	public static void main(String[] args) {

		Person[] people = new Person[10];
		
		Person person1 = new Person("Atanas Dobrinkov Petrakiev", (short)34, Gender.MALE);
		Person person2 = new Person("Veska Aprilova Slavqnova", (short)27, Gender.FEMALE);
		Student student1 = new Student("Vasil Paraskevov Karagiozov", (short)20, Gender.MALE, 4.68f);
		Student student2 = new Student("Penka Naneva Laleva", (short)21, Gender.FEMALE, 5.24f);
		Employee employee1 = new Employee("Kalinka Tsvetanova Biserova", (short)35, Gender.FEMALE, 25);
		Employee employee2 = new Employee("Borislav Damqnov Iliev", (short)37, Gender.MALE, 27);
		
		people[0] = person1;
		people[1] = person2;
		people[2] = student1;
		people[3] = student2;
		people[4] = employee1;
		people[5] = employee2;
		
		for (int index = 0; index < people.length; index++) {
			if (people[index] != null) {
				if (people[index].getClass() == Person.class) {
					people[index].showPersonInfo();
				}
				if (people[index].getClass() == Student.class) {
					((Student) people[index]).showPersonInfo();
				}
				if (people[index].getClass() == Employee.class) {
					((Employee) people[index]).showPersonInfo();
				}
			}
		}
		
		for (int index = 0; index < people.length; index++) {
			if (people[index] != null) {
				if (people[index].getClass() == Employee.class) {
					System.out.printf("\nOvertime money for %s : %.2f", people[index].name, ((Employee) people[index]).calculateOvertime(2));
				}
			}
		}
	}

}
