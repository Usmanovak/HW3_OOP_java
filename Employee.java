public abstract class Employee implements Comparable<Employee>{     // *любой тип созданный на базе Employee может быть отсортирован
    
    protected String surName;
    protected String name;
    protected int age;
    protected double salary;
    
    public Employee(String surName, String name, int age, double salary) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getSurName() {
        return surName;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }

    protected abstract double calculateSalary();


    public String toString() {
        return String.format("%s %s ", surName, name);
    }

    /*Сортировка по фамилии */
    @Override
    public int compareTo(Employee o) {
        int res = this.surName.compareTo(o.getSurName()); //метод возвращает результат сравнения фамилии одного сотрудника с фамилией другого
        if (res == 0) {
            return name.compareTo(o.name); // если фамилии совпадут, то сортировка производится по имени
        }
        return res;
    }
}
