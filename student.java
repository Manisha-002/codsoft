import java.util.*;
public class student{
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks of science  : ");
        int n=sc.nextInt();
        System.out.print("Enter Marks of Maths : ");
        int m=sc.nextInt();
        System.out.print("Enter Marks of English : ");
        int E=sc.nextInt();
        System.out.print("Enter Marks of hindi : ");
        int h=sc.nextInt();
        System.out.print("Enter Marks of computer : ");
        int C=sc.nextInt();
        int total_marks=n+m+E+h+C;
        System.out.print("total marks :"+total_marks);
        System.out.println();
        double average_percentage=total_marks/5;
        System.out.println("Average percentage : "+average_percentage);
        if(average_percentage>=90){
            System.out.println("Grade : A");
        }else if(average_percentage>=80 && average_percentage<90){
            System.out.println("Grade : B");
        }else if(average_percentage>=70 && average_percentage<80){
            System.out.println("Grade : C");
        }else if(average_percentage>=60 && average_percentage<70){
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : E");
        }
    }
}
