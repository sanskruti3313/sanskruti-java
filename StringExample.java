//package StringDemo

public class StringExample{


    public static void main(String[] args) {
        String s1="HELLO";
        String s2="APTECH";
        System.out.println("length of s1 is:"+s1.length());
        System.out.println("character of index 4 is:"+s1.charAt(4));
        System.out.println(s1.concat(s2));
        System.out.println("index od A is:"+s2.indexOf('A'));
        System.out.println("last index  of h is:"+s2.lastIndexOf('H'));
        System.out.println("replace aptech to kptech "+s2.replace('A','K'));

        String s3="   hello";
        System.out.println("length of s3 is:"+s3.length());
        System.out.println("original s3 is:"+s3);
        String s4=s3.trim();
        System.out.println("length of s4 is:"+s4.length());
        System.out.println("after trim s4 is:"+s4.length());

    }
    
}
