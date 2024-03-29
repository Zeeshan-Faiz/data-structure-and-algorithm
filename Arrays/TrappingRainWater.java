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
     *                      🟫
     *          🟫🟦🟦🟦🟦🟫
     *          🟫🟦🟦🟫🟦🟫
     *          🟫🟫🟦🟫🟫🟫
     *          🟫🟫🟦🟫🟫🟫
     *           4 2  0 3  2 5
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

    static int trap1(int[] ar){
        int res = 0;
        for(int i = 1; i <= ar.length - 2; i++){
            
            //finding left bar
            int lb = ar[i];
            for(int j = 0; j < i; j++){
                if(ar[j] > lb)
                    lb = ar[j];
            }

            //finding right bar
            int rb = ar[i];
            for(int j = i+1; j < ar.length; j++){
                if(ar[j] > rb)
                    rb = ar[j];
            }

            //Finding the minimum water level that can be trapped between rb and lb
            int wl;
            if(rb > lb)
                wl = lb;
            else
                wl = rb;
            
            int trappedWater = wl - ar[i];
            res = res + trappedWater;
        }
        return res;
    }

    /*
     * Approach 2 (Optimized) : As we can see that the time complexity of approach 1 was O(n^3), which is not good
     * we'll try to reduce that by creating two differnet arrays lb[] & rb[] which will store the left bar value and 
     * right bar value for each element and then we can accordingly find the trapped water units.
     *   
     *      ---->
     * lb = 4  4  4  4  4  5
     * ar = 4  2  0  3  2  4
     * rb = 5  5  5  5  5  5
     *                  <----
     * Time Complexity = O(n) + O(n) + O(n) = O(3n) ~ O(n) 
    */

    static int trap2(int[] ar){

        int res = 0;
        int[] lb = new int[ar.length];
        int[] rb = new int[ar.length];
        
        //finding left bar
        lb[0] = ar[0];
        for(int i = 1; i < ar.length; i++)
            lb[i] = Math.max(ar[i], lb[i-1]);

        //finding right bar
        rb[ar.length-1] = ar[ar.length-1];
        for(int i = ar.length-2; i >= 0; i--)
            rb[i] = Math.max(ar[i], rb[i+1]);

        //calculating trapped water
        for(int i = 1; i < ar.length; i++){
            res = res + Math.min(lb[i], rb[i]) - ar[i];
        }
        return res;
    }

    /*
     * Approach 3 (Using two pointers) : The logic which we are going to apply here is that for any particular bar
     * to trap water both the bar to it's left and the bar to it's right should be greater than it's own height.
     * We'll be taking two indexes l & r which will work according to our logic and we'll increment result only when
     * the condition specified by us is true.
     * 
     * Time Complexity = O(n) 
    */

    static int trap3(int[] ar){

        int res = 0, l = 0, r = ar.length-1;
        int lhb = ar[0], rhb = ar[ar.length-1];

        while(l <= r){

            if(lhb <= rhb){
                if(ar[l] >= lhb)
                    lhb = ar[l];
                else
                    res = res + lhb - ar[l];
                l++;
            }
            else{
                if(ar[r] >= rhb)
                    rhb = ar[r];
                else
                    res = res + rhb - ar[l];
                r--;
            }
        }
        return res;
    }


    public static void main(String[] args){

        int ar[] = {4,2,0,3,2,5};
        System.out.println(trap3(ar));
    }
}
