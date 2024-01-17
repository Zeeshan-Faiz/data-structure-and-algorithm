public class WoodCutting {
    
    /*
     * There is a given integer array A of size N denoting height of N trees. Ojas has a wood cutter machine
     * which can be set with a height parameter H(in metres) which cuts off all tree parts higher than H. Example
     * if trees length were 20,15,10 and 17 metres and Oja raised his blade to 15 metres the reamining tree heights
     * will be 15,15,10,15 and total wood cut down is (2+5) = 7 metres.Help Oja to find the maximum height of the cutting
     * blade such that it still allows him to cut off atleast b metres of wood.
     * NOTE : The sum of all height of trees will exceed b, thus Oja will always be able to obtain the required 
     * amount of wood.
     * 
     * Example h = {20,15,10,17} and b = 7(which means calculate the hight of the blade such that Oja cut from all 
     * the above 4 trees and get approximate 7 metres without wasting extra woods)
    */

    /*
     * Approach : We'll take the longest tree height and perform binary search along it's length in order to get
     * the required length of the blade.
     *      h
     *      20          
     *      19
     *      18
     *      17                                  17
     *      16                                  16
     *      15          15                      15
     *      14          14                      14
     *      13          13                      13
     *      12          12                      12
     *      11          11                      11
     * m    10          10          10          10
     *      9           9           9           9
     *      8           8           8           8
     *      7           7           7           7   
     *      6           6           6           6
     *      5           5           5           5
     *      4           4           4           4
     *      3           3           3           3
     *      2           2           2           2
     *      1           1           1           1
     *    L
     * Given array h = {20,15,10,17} and b = 7
     * 
     * Taking the longest tree height and performing binary tree:
     * l = 0, h = 20, m = (l+h)/2 = 10
     * and then try to see if the blade length is 10 how much wood we'll get after cutting all the four tress from
     * the top.
     * (10+5+0+7) = 22 > b(7)
     * As the amount of wood we're getting is larger than the required wood, we'll adjust the height by making
     * (l = m) and now when we find m = (l+h)/2 = (10+20)/2 => m = 15
     * Now when we try to cut the tree with the blade height of 15 we'll get
     * (5+0+0+2) = 7 ~ b(7)
     * 
     * Hence we can conclude that to get the blade height to 15 metres will give us exactly 7 metre of food when
     * 4 trees in a row of hight 20,15,10,17 respectively are cut down.
     * 
     * 
    */


}
