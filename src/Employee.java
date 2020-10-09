import java.awt.print.Printable;

public abstract class Employee extends Person implements Worker {
    protected String name;
    protected String department;

    public Employee(String name, String department){
        super(name);
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

//    public abstract String work();       turned into interface

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        employees [0] = new Developer("Austin", "IT");
        employees [1] = new Manager("Joe", "Dept Manager");

        for(Employee e : employees){
            System.out.println("employee.work() = " + e.work());
        }


    }
}
