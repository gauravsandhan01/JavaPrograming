import java.util.Scanner;

public class percentage{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Math mark: ");
        int math = sc.nextInt();

        System.out.println("Enter Phy Mark ");
        int Phy =sc.nextInt();

        System.out.println("Enter Bio Mark");
        int Bio= sc.nextInt();

        System.out.println("Enter Chem Mark");
        int Chem = sc.nextInt();

        int Total = math+ Phy+Bio+Chem;
        double per= Total / 4.0;

        System.out.println("Total Mark is :" + Total);
        System.out.println("Total percentage is: "+per);


    }
}