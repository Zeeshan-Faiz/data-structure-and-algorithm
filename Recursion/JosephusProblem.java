import java.util.Scanner;

public class JosephusProblem {
    
    /*
     * Write a program to input the number of people(n) and killing factor(k), and
     * find the position in which a person should stand in order to survive the killing.
     * 
     * Example n = 7 & k = 3
     * O/P = 4th position.
     * 
    */

    /*
     * In Josephus problem people are standing in circle we can represent the same in an
     * array. And suppose we have Number of people(n) as 7 and killing(k) factor is 3.
     * 
     * And the person at position 0 starts killing the person at position 2 (killing factor = 3;
     * the count starts from the person who's going to kill)
     * 
     * 
     * If we try to think about this problem recursively then,
     *      0 1 2 3 4 5 6
     *      A B C D E F G
     * 
     * suppose we've 7 people(A-G) standing in the given index.
     * 
     * So after each killing the number of people will decrease starting from C.
     *      0 1 2 3 4 5
     *      D E F G A B
     * 
     * and if the process keeps on going,
     *      0 1 2 3 4 
     *      G A B D E
     * 
     *       0 1 2 3
     *       D E G A
     * 
     *        0 1 2
     *        A D E
     * 
     *        0 1
     *        A D
     * 
     *         0
     *         D (This signifies that if there are 7 people in a circle and the first person(A) starts killing the
     *            person after 3 positions and this goes until only one person is left then in that case person(D)
     *            who was standing in position 4 will survive) 
     * 
     * To find a relation between n and K and the position at which if a person stands will survive, we can produce a 
     * general formula=>
     * 
     *     (k)  (n) 
     * (0 + 3) % 7 = 3 (Here 3 signifies that if person (D) was standing with 6 other people then he should stand at position 3 in order to survive)
     * (1 + 3) % 7 = 4
     * (2 + 3) % 7 = 5
     * (3 + 3) % 7 = 6
     * (4 + 3) % 7 = 0
     * (5 + 3) % 7 = 1
     * (6 + 3) % 7 = 2
     * 
     * Recurrence relation : jos(n,k) = ((jos(n-1, k) + k) % n;
     * Base condition : (n == 1)
     * 
    */

    static int jos(int n, int k){

        if(n == 1)
            return 0;

        return (jos(n-1,k) + k) % n;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of people : ");
		int n = sc.nextInt();
        System.out.println("Enter the Killing factor : ");
        int k = sc.nextInt();

        int position = jos(n, k) + 1;

        System.out.println("A person should stand at position "+ position + " to survive.");
        

        sc.close();
    }



}
