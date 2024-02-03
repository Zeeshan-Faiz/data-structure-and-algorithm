/*
Given an array of intergers containing values from 1 to N. Sort the array in ascending order using Cyclic Sort.
*/

public class CyclicSort {
    
    /*
    Approach : As the array contains the values from 1 to N so after sorting of the elements each elements position
    will be equal to the element - 1.
                  0 1 2 3 4(index)   
    For Example : 3,5,2,1,4

                 0,1,2,3,4(index)
    After sort : 1,2,3,4,5

    Element at index 2 = 3 similary element at index 3 = 4
    therefore we can say that element = index + 1 OR element - 1 = index

    Time Complexity = O(N)
    */
}
