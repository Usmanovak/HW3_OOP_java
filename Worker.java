public class Worker extends Employee {

    public Worker(String surName, String name, int age, int salary) {
        super(surName, name, age, salary);
    }

    @Override
    protected double calculateSalary() {
        return salary;
    }


    @Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(surName);
		stringBuilder.append(" ");
		stringBuilder.append(name);
		stringBuilder.append("; age: ");
		stringBuilder.append(age);
		stringBuilder.append("; salary: ");
		stringBuilder.append(salary);
        stringBuilder.append(" ");
        stringBuilder.append("; Worker");
        stringBuilder.append(" ");
		return stringBuilder.toString();
	}
}
