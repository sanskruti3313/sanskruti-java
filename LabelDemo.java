public class LabelDemo {
    public static void main(String[] args) {
        outer:
        for(int i=1;i<=10;i++)
        {
            System.out.println("outerloop: "+i);
            for(int j=1;j<=10;j++)
            {
                if(j>i)
                    break outer;
            }

        }
        System.out.println("I am outside the loop");
    }
    
}
