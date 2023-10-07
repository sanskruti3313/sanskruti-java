package ArrayDemo;

public class TwoArray {
    public static void main(String[] args) {
        int marks[][]={{100,200,300},{400,500,600},{700,800,900}};
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.print("\t"+marks[i][j]);
            }
            System.out.println();
        }
    }
    
}
