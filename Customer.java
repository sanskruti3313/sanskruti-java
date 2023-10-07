public class Customer {

     int custId;
     String custName;
    //default constructor
     Customer()
     {
        System.out.println("I am a default constructor");
        custId=2025;
        custName="sanskruti";

     }
     //parameterized cunstructor
     Customer(int id,String name)
     {
        System.out.println("\n i am a parameterized constructor");
        custId=id;
        custName=name;
     }
     void displayCustomer()
     {
            System.out.println("customer id is "+custId);
            System.out.println("customer name is "+custName);
     }

    }