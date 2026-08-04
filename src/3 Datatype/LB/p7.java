//Take two numbers as Strings, convert them to int, and print their sum.

package LB;
import java.util.Scanner;

public class p7 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First Number : " );
        String num1 =input.nextLine();
        System.out.print("Enter a Second Number : ");
        String num2 =input.nextLine();
        
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        int c =a+b;
        System.out.println("Sum is : "+ c);


    }
    
}
