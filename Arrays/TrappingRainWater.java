public class TrappingRainWater {
    
    /*
     * Given a non-negative integer array representing an elevation map where the width of each bar is 1 unit
     * compute how much water it can trap after raining.
     * 
     * Example ar = {4,2,0,3,2,5}
     * O/P = 9
    */

    /*
     * Approach 1 (Brute Force) : There are certain observations we can make out after going through the question
     * 1)We need minimum of 3 blocks to store/trap rain water.
     * ii)Descending/Ascending blocks can't store water.
     * iii)As 1st and last bar can't store water itself, we'll be considering from 2nd starting bar and 2nd last
     * ending bar. 
     * 
     *     
     *          🟫
     *          🟫
     *          🟫🟫
     *          🟫🟫
     *            4 2  0 3  2 5
     * 
     * Total trapped water = (2+4+1+2) = 9 units of water 
     * 
     * Algorithm:
     * i)Find left bar(Lb) and right bar(Rb) for each bar.
     * ii)Find water level(min(Lb,Rb))'
     * iii)Find trapped water (water level - hight of the bar)
     * iv)Add all trapped water and return the result.
     * 
     * Time Complexity = O(n) x O(n) x O(n) = O(n^3)
    */


}
