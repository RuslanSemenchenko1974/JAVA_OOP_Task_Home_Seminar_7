import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HomeTask_7 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иванов", "Иван", "Бухгалтерия", 50000);
        Employee e2 = new Employee("Петров", "Петр", "Бухгалтерия", 30000);
        Employee e3 = new Employee("Сидоров", "Иван", "Бухгалтерия", 70000);
        Employee e4 = new Employee("Смирнов", "Гоша", "Бухгалтерия", 40000);
        Employee e5 = new Employee("Иванов", "Иван", "Магазин", 60000);
    System.out.println(e1.equals(e5));
    System.out.println(e1.equals(e2));
    System.out.println(e1.equals(e3));
    System.out.println(e1.equals(e4));
    
    HashSet <Employee> myEmployees = new HashSet<>(new ArrayList<>(List.of(e1, e2, e3, e4, e5)));
    System.out.println("Список сотрудников");
    System.out.println(myEmployees);
    }
}
