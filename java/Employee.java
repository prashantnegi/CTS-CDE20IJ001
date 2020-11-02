public class Employee {
    
    private String name;
    private String email;
    private String empId;

    public void print() {
        System.out.printf("ID: %s Employee: %s Email: %s ", 
        empId, name, email);
    }
}
