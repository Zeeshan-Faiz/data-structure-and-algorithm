public class MinConsecutiveFlips {
 
    /*
     * You are given an array containing only 1 and 0. You have to find the minimum consecutive flips that will
     * make the whole array either all 0 or all 1. Remeber that flipping happens groupwise or if the element is single
     * then flip just that single element if possible.
     *  
     *               0 1 2 3 4 5 6 7 8 9 10
     * Example ar = {1,1,0,0,1,1,0,0,0,1,1}
     * O/P = 2-3
     *       6-8
     * 
     * Example ar = {1,1,0,0,0,1,0,0,1,1,0,1}
     * O/P = 2-4
     *       6-7
     *       10-10
    */

    /*
     * Approach : After looking closely into the given examples and all other possible combinations that our mind
     * can think of, we can say that which ever element is present at ar[0] (first element), we'll flip the oppostite
     * of that element.
     * Example ar = {1,1,0,0,1,1,0,0,0,1,1}
     * We have 3 groups of 1 and 2 groups of 0 (As group of 0 is minimum it's better if we try to flip 0)
     * 
     * Also if both groups of 1 and 0 are same
     * Example ar = {1,1,0,0,1,1,0,0,0}
     * We have 2 groups of 1 and 2 groups of 0. In this case we can flip either 0 or 1
    */

    static void flipElements(int[] ar){

        for(int i = 1; i < ar.length; i++){
            
            //check if the current element is different than the previous element
            if(ar[i] != ar[i-1]){

                //check if the current element is not the same as the first element of the array(so that we can flip it)
                if(ar[i] != ar[0])
                    System.out.print(i + " - ");
                else   
                    System.out.println(i-1);
            }
        }
        //handling if both groups of 1 and 0 are same
        if(ar[0] != ar[ar.length-1])
            System.out.println(ar.length-1);
    }

    public static void main(String[] args){

        int ar[] = {1,1,0,0,1,1,0,0,0,1,1};
        flipElements(ar);
    }
}
