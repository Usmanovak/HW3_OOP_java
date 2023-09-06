import java.util.Comparator;

public class ageComparator implements Comparator<Employee>{

    /* Сортировка сотрудников по возрасту */
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    
}