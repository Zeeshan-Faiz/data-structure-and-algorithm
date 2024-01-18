public class PaintersPartition {
    
    /*
     * Given 2 integers A and B and an array of integers C of size N. Elements C[i] represents length of paint board
     * You have to paint all N boards [C0,C1,C2,C3....Cn-1]. There are A painters availabe and each of them takes B
     * unit of time to paint 1 unit of board.
     * Calculate and return the minimum time required to paint all boards also noting that any painter will only paint
     * contagious sections of the boards.
     * NOTE: i)2 painters can't share a board to paint. A board can't be painted partially by one painter and partially
     * by the other one.
     * ii)A painter will only paint contagious boards which means a configuration where a painter paints board 1 & 3
     * but not 2 is invalid.
     * 
     * Example ar = {10,20,30,40} a = 2(Number of painters) b = 2(unit of time to paint 1 unit of board)
     * 
     *      Painter 1                   Painter 2
     *      10+20+30+40 = 100                 = 0
     *      10+20+30    = 60             40   = 40
     *      10+20       = 30          30+40   = 70
     *      10          = 10        20+30+40  = 90
     *                  = 0       10+20+30+40 = 100
     * 
     * Here if we need to find the min(100,60,70,90,100) = 60 which denotes that out of 5 maximum value of units of boards 60
     * is the minimum unit of boards that can be distributed among 2 painters. 
    */

    /*
     * Approach : Lowest unit of board that can be allocated to a painter = 0
     * Maximum unit of board that can be allocate to a painter (10+20+30+40) = 100
     * Here l = 0, h = 100 and m = (l+h)/2
     * We'll be using binary search to find whether when the all the boards are allocated to all painters then the
     * out of all maximum unit of boards that the painters can paint we are able to return the minimum number of unit of board.
     * 
     * We'll also be having painters and pbc and res as variable to store number of painters, painters board count and
     * final result respectively.
    */

    static int maxTime(int[] ar, int a, int b){
        
        //find total number of unit of boards
        int l = 0, h = 0;
        for(int i = 0; i < ar.length; i++){
            h = h + ar[i];
        }

        int res = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(isPossibleSol(ar,a,m)){
                res = m;
                h = m - 1;
            }
            else
                l = m + 1;
        }
        return res*b;
    }

    static boolean isPossibleSol(int[] ar, int a, int m){

        int painters = 1, pbc = 0;
        for(int i = 0; i < ar.length; i++){

            //check the unit of board is greater than the assumed highest unit of board
            if(ar[i] > m)
                return false;
            
            if(pbc + ar[i] <= m)
                pbc = pbc + ar[i];
            else{
                painters++;
                if(painters > a)
                    return false;
                
                pbc = ar[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] ar = {10,20,30,40};
        int a = 2;
        int b = 2;
        System.out.println(maxTime(ar,a,b));
    }


}
