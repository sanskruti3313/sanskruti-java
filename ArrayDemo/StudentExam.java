package ArrayDemo;

public class StudentExam {
    int marks[]=new int[5];
    void storeMarks()
    {
        marks[0]=200;
        marks[1]=300;
        marks[2]=400;
        marks[3]=500;
        marks[4]=600;

    }
    void displayMarks()
    {
        for(int i=0;i<=4;i++)
        {
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        StudentExam se=new StudentExam();
        se.storeMarks();
        se.displayMarks();
    }
    
}
