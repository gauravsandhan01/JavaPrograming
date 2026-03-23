public class Logical {
    public static void main(String[] args) {
        // Logical AND (&&)
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b)); // false

        // Logical OR (||)
        System.out.println("a || b: " + (a || b)); // true

        // Logical NOT (!)
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true

        // Combined examples
        int x = 10;
        int y = 20;
        System.out.println("(x < 15) && (y > 15): " + ((x < 15) && (y > 15))); // true
        System.out.println("(x > 15) || (y < 25): " + ((x > 15) || (y < 25))); // true
        System.out.println("!(x == y): " + (!(x == y))); // true
    }
}
