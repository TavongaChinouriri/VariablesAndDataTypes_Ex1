import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        // Program to calculate the average percentage score of a given student doing 5 subjects/courses.
        // His/her marks must be taken as input from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Mark 1");
        int m1 = sc.nextInt();
        System.out.println("Mark 2");
        int m2 = sc.nextInt();
        System.out.println("Mark 3");
        int m3 = sc.nextInt();
        System.out.println("Mark 4");
        int m4 = sc.nextInt();
        System.out.println("Mark 5");
        int m5 = sc.nextInt();
        double averagePercentage = (m1+m2+m3+m4+m5)/5;
        System.out.println("Average percentage for the five subjects is " + averagePercentage);
    }
}