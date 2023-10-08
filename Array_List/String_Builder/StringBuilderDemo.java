package Array_List.String_Builder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder strb=new StringBuilder("sanskruti");

        System.out.println(strb.append("surve"));
        System.out.println(strb.append(46));
        System.out.println(strb.insert(3, 7));
        System.out.println(strb.delete(3, 5));
        System.out.println(strb.reverse());
    }
    
}
