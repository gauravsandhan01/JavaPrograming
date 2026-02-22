public class bitwise {
    public static void main(String[] args) {
        int a = 5;      // 0101
        int b = 3;      // 0011

        // AND operator
        System.out.println("a & b = " + (a & b));  // 0001 = 1

        // OR operator
        System.out.println("a | b = " + (a | b));  // 0111 = 7

        // XOR operator
        System.out.println("a ^ b = " + (a ^ b));  // 0110 = 6

        // NOT operator
        System.out.println("~a = " + (~a));        // inverts all bits

        // Left shift
        System.out.println("a << 1 = " + (a << 1)); // 1010 = 10

        // Right shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0010 = 2

        // Unsigned right shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // 0010 = 2
    }
}