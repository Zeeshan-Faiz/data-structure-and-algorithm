public class PrintAllPermutationInDice {

    /*
     * Given a normal dice print all possible combinations that may be possible for a given target number.
     * Ex = 4
     * O/P = 
    */
    
    //Approach 1 : Printing the ans directly after the recusrive call ends
    static void dice(String ans, int target) {
        
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            if(i <= target)
                dice(ans + i, target - i);
        }
    }

    // Approach 2 : Add all the ans in an ArrayList and then return the list
    

    public static void main(String[] args) {
        
        dice("", 4);
    }
}