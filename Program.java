import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(){

        String[] names = new String[] {"Анатолий", "Глеб", "Камиль", "Мирон", "Степан", "Евгений", "Александр", "Андрей", "Леонид", "Валентин", "Станислав", "Максим", "Олег", "Яровслав", "Михаил", "Николай", "Святослав", "Марсель", "Борис", "Константин"};

        String[] surnames = new String[] {"Усманов", "Солуянов", "Григорьев", "Фаттахов", "Иванов", "Шапкин", "Петрухин", "Кофеен", "Стаканчиков", "Ноутбуков", "Столешников", "Холодильников", "Балконин", "Мышкин", "Диванов", "Носков", "Портнов", "Таваенов", "Литвин", "Листьев"};

        int salaryIndex = random.nextInt(500, 900);
        int ageEmployee = random.nextInt(18, 55);
        int randomEmployee = random.nextInt(0,2);

        Employee employee;
        if (randomEmployee == 0){
                    employee = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], ageEmployee, salaryIndex * 100);
        } else {
                    employee = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], ageEmployee, salaryIndex * 100);
        }

        return employee;
    }



    public static Employee[] generateEmployees(int counter){
        Employee[] employees = new Employee[counter];
        for (int i = 0; i < counter; i++) {
                employees[i] = generateEmployee();
            }
        return employees;
    }
    



    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);
        System.out.println();
        System.out.println("------------------------EMPLOYEES----------------------------");
        for (Employee employee : employees ) {
            System.out.println(employee);
        }

        Arrays.sort(employees, new ageComparator());
        System.out.println();
        System.out.println("----------------------Sotring by AGE--------------------------");
        for (Employee employee : employees){
            System.out.println(employee);
        }

        Arrays.sort(employees, new salaryComparator());
        System.out.println();
        System.out.println("--------------------Sorting by SALARY-------------------------");
        for (Employee employee : employees){
            System.out.println(employee);
        }


        Arrays.sort(employees);
        System.out.println();
        System.out.println("-------------------ALPHABETICAL sorting ----------------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}

