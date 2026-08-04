//Demonstrate widening and narrowing casting with suitable examples
package LB;

public class p8 {
    public static void main(String args []){
        // Widening Casting
        int a=23;
        double d= a;
        System.out.println("Widening Casting int to double : " +d);

        //Narrowing Casting
        double dd =45.67;
        int aa =(int)dd;
        System.out.println("Narrowing Casting double to int " + aa);

    }
    
}
