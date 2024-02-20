public class ProductOfDigitsOfNumber {

    /*
     * Write a program to find the product of given digits.
     * Ex num = 55
     * O/P = 25
    */

    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n % 10) * prod(n / 10);
    }
    
}
