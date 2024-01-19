public class MakingBouquets {
    
    /*
     * Given an integer array, we need to make m bouquets using k adjacent flowers from the garden. The garden
     * consists of n flowers and the ith flower will bloom in the ar[i] day and then can be used in exactly one
     * bouquet. Return the minimum number of days you need to wait to be able to make m bouquets having k flowers
     * in it from the garden.
     * 
     * Example ar = {1,10,3,9,10,2}   ;m(no. of bouqets) = 3  ;k(adjacents flowers to add in bouquet) = 2
     *              <------------->
     *              <No. of days for
     *              different flowers
     *              to bloom>
    */

    /*
     * Approach : Let's find the different combinations that can be found while making 3(m) bouquets and adding
     * 2(k) adjacent flowers.
     * 
     *          1       10      3       9       10      2
     *          f1      f2      f3      f4      f5      f6
     * Day 1    ✅     ❌      ❌     ❌      ❌     ❌
     * Day 2    ✅     ❌      ❌     ❌      ❌     ✅(No two adjacent flowers)
     * Day 3    ✅     ❌      ✅     ❌      ❌     ✅
     * Day 4    ✅     ❌      ✅     ❌      ❌     ✅
     * Day 5    ✅     ❌      ✅     ❌      ❌     ✅
     * Day 6    ✅     ❌      ✅     ❌      ❌     ✅
     * Day 7    ✅     ❌      ✅     ❌      ❌     ✅
     * Day 8    ✅     ❌      ✅     ❌      ❌     ✅
     * Day 9    ✅     ❌      ✅     ✅      ❌     ✅(flower 9 and 10 are adjacent but only 1 bouquet was produced)
     * Day 10   ✅     ✅      ✅     ✅      ✅     ✅(3 bouquets are made by 3 pairs of adjacent flowers)
     * Day 11   ✅     ✅      ✅     ✅      ✅     ✅
     * Day 12   ✅     ✅      ✅     ✅      ✅     ✅
     * 
     * We can see that after day 10 we can have all the 3 bouquets ready with 2 adjacent flowers, however the 
     * questions requires to have the minimum number of days that is required to acheive 3 bouqets so in that case
     * case 10 is the output.
     * 
     * We can solve this problem using Binary search wherein:
     * L = 2 (Flower which will take the least amount of days to bloom)
     * H = 10 (Flower which will take the most amount of days to bloom)
     * 
     * We'll assume any one day as the minimum day that is required to produce 3 bouquets, if the condition satisfies
     * for adjacent flowers and we were able to make 3 bouquets we'll return m otherwise we'll change the value of m
     * accordingly and check one again until we get the minimum number of days.
    */

    static int minDaysBouquet(int[] ar, int m, int k){

        //check if total required flowers to make the demanded bouquets are available in garden or not.
        if(m*k > ar.length)
            return -1;

        int l = ar[0], h = ar[0];
        for(int i = 0; i< ar.length; i++){

            if(ar[i] < l)
                l = ar[i];
            if(ar[i] > h)
                h = ar[i];
        }
        int res = -1;
        while (l <= h) {
            
            int mid = (l+h)/2;
            if(isPossibleSol(ar,m,k,mid)){
                res = mid;
                h = m - 1;
            }
            else
                l = m + 1;
        }
        return res;

    }


}
