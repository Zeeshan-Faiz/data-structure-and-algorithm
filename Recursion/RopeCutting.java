public class RopeCutting {
    
    /*
     * Given a rope of length n, you need to find the maximum number of pieces you can make
     * such that the length of every peice is from set{a,b,c} for the given values of a,b,c.
     * 
     * Example n = 15, a = 5, b = 8, c = 7
     * O/P = 3
     * 
     * Here 3 signifies that to cut the rope of length n = 15,
     * we cam have either 2 small pieces of length 8 and 7
     * or
     * we can have all 3 small pieces of length 5 and hence the output is 3
    */


    /*
     * Approach : We can start by cutting the original rope of length 15 into three different
     * pieces 5,8,7.
     * Suppose we take the first piece 5, so the new length of the rope will be (15-5) = 10
     * and now this new rope of length 10 can also be cut into 5,8,7.
     * We once again take the first piece 5, so the new length of the rope will be (10-5) = 5
     * and now this new rope of length 5 can also be cut into 5,8,7.However we can't cut it by 8 or 7 both being 
     * greater than the actual length of the rope. In this scenario we'll return -1.
     * And when we selected 5,the new length of the rope will be (5-5) = 0, in this case we'll return 0.
     * 
     * We'll do the above steps recursively until we select all the numbers and try to find the subsets.
    */


}
