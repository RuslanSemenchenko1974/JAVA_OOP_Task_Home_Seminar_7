import java.util.Objects;

public class Employee{
    private String name;
    private String surname;
    private String office;
    private double salary;

    public Employee(String name, String surname, String office, double salary){
        this.name = name;
        this.surname = surname;
        this. office = office;
        this.salary = salary;
    }
    public String getName(){ return name;}
    public String getSurname(){ return surname;}
    public String getOffice(){ return office;}
    public double getsalary(){ return salary;};

    @Override
    public boolean equals(Object obj) {
        if (this== obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Employee o = (Employee) obj;
        return o.getName()==this.getName()&& o.getSurname()==this.getSurname();
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(name, surname);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%s  %s : %s) ", getName(), getSurname(), getOffice());
    }
}