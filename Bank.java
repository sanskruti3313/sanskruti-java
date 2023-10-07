public class Bank {
    public static void main(String[] args) {
        Customer cust=new Customer();
        cust.displayCustomer();
        Customer cust1=new Customer(2026,"SANSKRUTI");
        cust1.displayCustomer();
        Customer cust2=new Customer(2027, "abc");
        cust2.displayCustomer();
    }
    
}
