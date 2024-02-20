public class SumOfDigitsOfNumber {

    /*
     * Write a program to find the sum of given digits.
     * Ex num = 1342
     * O/P = 10
    */

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }
    
}
