public class FrequescyOfElements {
    
    /*
     * Write a program to find the frequency of elements in a SORTED array.
     * 
     * Example ar = {20,20,30,30,30,40}
     * O/P = 20  2
     *       30  3
     *       40  1
    */

    static void frequency(int[] ar){
        
        int freq = 1, i = 1;
        while(i < ar.length){

            while(i <ar.length && ar[i] == ar[i-1]){
                freq++;
                i++;
            }
            System.out.println(ar[i-1] + " " + freq);
            freq = 1;
            i++;
        }
        if(ar.length == 1 || ar[i-1] != ar[i-2])
            System.out.println(ar[i-1] + " " + freq);
    }


}
