public class basic{
    public static void main(String[] args){
       
        String name = "Gaurav";
        int value =name.length(); //lenth of the String

        System.out.println(value);
        System.out.println(name.toLowerCase());  // Write for lower case
        System.out.println(name.toUpperCase()); // Conver into Uppercase

        String nonTrimmedString="      Gaurav      ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim()); // remove white space

        System.out.println(name.substring(2)); //index 2 pasun pude String Write keli jate indexing sstart form 0
        
         System.out.println(name.substring(2 , 4));


    }
}