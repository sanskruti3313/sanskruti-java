public class TypesOfVariables {
    int result;

    int sum() {
        int a, b;
        a = 20;
        b = 30;
        result = a + b;
        return result;
    }

    int division() {
        int a, b;
        a = 20;
        b = 40;
        result = a / b;
        return result;

    }

    public static void main(String[] args) {
        TypesOfVariables ty = new TypesOfVariables();
        System.out.println("sum is " + ty.sum());
        System.out.println("division is " + ty.division());

    }
}
