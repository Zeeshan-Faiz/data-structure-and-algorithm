import java.util.ArrayList;

public class PrintAllPermutationInMultiFaceDice {

    /*
     * Given a multiface dice print all possible combinations that may be possible for a given target number.
     * Ex = 4
     * O/P = [1111, 112, 121, 13, 211, 22, 31, 4]
    */
    
    //Approach 1 : Printing the ans directly after the recusrive call ends
    static void dice(String ans, int target,int face) {
        
        if (target == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= face; i++) {
            if(i <= target)
                dice(ans + i, target - i,face);
        }
    }

    // Approach 2 : Add all the ans in an ArrayList and then return the list
    static ArrayList<String> diceRet(String ans, int target, int face) {
        
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= face; i++) {
            if(i <= target)
                res.addAll(diceRet(ans + i, target - i,face));
        }
        return res;
    }

    public static void main(String[] args) {
        
        //dice("", 4,8);
        System.out.println(diceRet("", 4,8));
    }
}