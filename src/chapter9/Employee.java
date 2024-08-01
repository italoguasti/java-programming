package chapter9;
// Inheritance | Herança

public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee(){
        super("italo"); // Super call the constructor of the superclass 
        System.out.println("In employee default construtor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
