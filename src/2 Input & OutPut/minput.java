import java.util.Scanner;

public class minput{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Name :");
        String name = sc.nextLine();

        System.out.print("Enter the College Name :");
        String College = sc.nextLine();

        System.out.print("Enter the Age :");
        int age =sc.nextInt();



        System.out.println("My Name is " + name );
        System.out.println("My age is " + age );
        System.out.println("My college name is " + College );

    }
}