import java.util.Random;

public class Freelancer extends Employee{

    public Freelancer(String surName, String name, int age, double salary) {
        super(surName, name, age, salary);
    }

    private int hours;       // кол-во рабочих часов в месяц 
    private int hourPrice;      // стоимость одного рабочего часа 

    public int getHours() {
        return hours;
    }

    public int getHourPrice() {
        return hourPrice;
    }

    private Random random = new Random();
    int monthHours = random.nextInt(52, 208);   //от 2 до 8 ч в день, 26 рабочих дней
    int oneHourPrice = random.nextInt(2000, 5000);  // цена за 1 рабочий час

    @Override
    protected double calculateSalary() {
        salary = monthHours * oneHourPrice; 
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
        stringBuilder.append("; Freelancer");
        stringBuilder.append(" ");
		return stringBuilder.toString();
	}
}
