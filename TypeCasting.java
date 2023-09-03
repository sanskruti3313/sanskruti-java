public class TypeCasting {
    public static void main(String[] args) {

        // implicit type casting (int to double)
        int a, b;
        a = 70;
        b = 90;
        double a1, b1, div;
        a1 = a;
        b1 = b;
        div = a1 / b1;
        System.out.println("division is: " + div);

        // explicit type casting (double to int)
        //syntax= destination variable=(destination datatype) source variable
        double pi = 3.14;
        int p = (int) pi;
        System.out.println("p value is: " + p);
    }

}
