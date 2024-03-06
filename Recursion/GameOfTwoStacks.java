import java.util.Arrays;

public class GameOfTwoStacks {

    /*
    Alexa has two stacks of non-negative integers, stack and stack where index denotes the top of the stack. Alexa challenges 
    Nick to play the following game:
    In each move, Nick can remove one integer from the top of either stack or stack.
    Nick keeps a running sum of the integers he removes from the two stacks.
    Nick is disqualified from the game if, at any point, his running sum becomes greater than some integer given at the 
    beginning of the game. Nick's final score is the total number of integers he has removed from the two stacks.
    
    Given a,b and maxSum for games, find the maximum possible score Nick can achieve.
    Example:
    a = {1,2,3,4,5}
    b = {6,7,8,9}

    The maximum number of values Nick can remove is 4.There are two sets of choices with this result.
    1)Remove 1,2,3,4 from a with the sum of 10 
    2)Remove 1,2,3 from a and 6 from b with a sum of 12

    Returns - int: the maximum number of selections Nick can make 
    */

    static int twoStacks(int x, int[] a, int[] b) {
        return twoStacks(x, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int x, int[] a, int[] b, int sum, int count) {
        
        if (sum > x) 
            return count;
    

        if (a.length == 0 || b.length == 0) 
            return count;
    

        int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }
    
}