public class Company {
    public static void main(String[] args) {
        Employees emp=new Employees();
        System.out.println("before address change");
        emp.displayEmployees();

        System.out.println("\n after address change");
        emp.changeAddress("panvel");
        emp.displayEmployees();
    }
    
}
