public class elseif{
    public static void main(String[]args){
        int mark = 17;

        if(mark >=90){
            System.out.println("Grade is A");
        }
        else if(mark >=80 && mark<=89 ){
            System.out.println("Grade is B");
        }
        else if( mark<=79 && mark>=70){
            System.out.println("Grade is C");
        }
        else if( mark<=69 && mark>=60){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Tu khi kamacha nhi prt Exam la yeu nko");
        }
    }
}