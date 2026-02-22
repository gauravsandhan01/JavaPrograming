import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Kilometer : ");
    int KM= sc.nextInt();

    double mile =KM*0.621371;
    System.out.println("Distance in miles = " + mile);
}