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
     * questions requires to have the minimum number of days that is required to acheive 3 bouqets.
     * 
    */


}
