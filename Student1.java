public class Student1 {
    String name;
    int rollNo;
    int age;
    String address;
    void initializedStudent1()
    {
        name="PRIYANKA";
        rollNo=46;
        age=20;
        address="panvel";
    }
    void displayStudent1()
    {
        System.out.println("name is "+name);
        System.out.println("rollNo is "+rollNo);
        System.out.println("age is "+age);
        System.out.println("address is "+address);
    }
    public static void main(String[] args) {
        Student1 st=new Student1();
        st.displayStudent1();
        st.initializedStudent1();


    }
}
