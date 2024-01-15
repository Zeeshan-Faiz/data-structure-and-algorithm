public class BinarySearch {
    
    /*
     * Write a program to input a key value and check whether this key is present in the 
     * given array using Binary Search if yes then print it's position in the array.
     * 
     * Example arr = {50,10,33,40,26} ; key = 40
     * O/P = 3
     * 
    */

    /*
     * Approach : To check for the given key present in an array we'll be using three different variables,
     * low,high and mid. After each iteration we'll divide our search range to half and start finding the array
     * element equal to the provided key.
     * 
     * Initially,our low variable will be pointing to the starting index of the array and our high variable will
     * be at the last index. And our mid will have the middle element of the array (low+mid)/2.
     * If the number at mid position is greater than the key, then we'll change our high to mid - 1
     * else if the number at mid position is less than the key, then we'll change our low to mid + 1,
     * we'll itertate over the same steps until we find the given key in the array.
     * 
     * NOTE : To use Binary Search we need to first sort the array.
     * Time Complexity of sorting an array = O(n Log n)
     * Time Complexity of finding an element using Binary Search = O(Log n)
     * 
     * Total Complexity = O(n Log n + Log n)
    */



}
