public class BookAllocation {
    
    /*
     * You'll be given a set of books whose pages will be specified in the form of array elements. You have to allocate
     * the books to a given number of students on the basis of below conditions:
     * i)A book will be allocated to exactly one student.
     * ii)Each student has to be allocated atleast one book.
     * iii)Allotment should be in contagious order.
     * iv)All books must be allocated.
     * 
     * You've to return the minimum of total number of pages out of all the combinations when the book is allocated
     * to different students.
     * 
     * Example arr = {12,34,67,90} b = 2(no. of students)
     * Different combination of allocating the books to two students:
     * 
     *      Student 1                   Student 2
     *      12,34,67 = 113 Pages        90 Pages
     *      12,34 = 46 Pages            67,90 = 157 Pages
     *      12 Pages                    34,67,90 = 191 Pages
     * 
     * Here if we need to find the min(113,157,191) = 113 which denotes that out of 3 maximum value of pages 113
     * is the minimum pages that can be distributed among 2 students.
    */

    /*
     * Approach : Lowest page that can be allocated to a student = 12
     * Maximum page that can be allocate to a student (12+34+67+90) = 208
     * 
     * Here l = 0, h = 203 and m = (l+h)/2
     * We'll be using binary search to find whether when the all the books are allocated to all students then the
     * out of all maximum number of pages that the students can get we are able to return the minimum number of page.
     * 
     * We'll also be having students and spc and res as variable to store number of students, student page count and
     * final result respectively.
     * Time Complexity = n + Log(sum(ar)) + n
     *                 = 2n Log(sum(ar)) ~ n Log(sum(ar))
    */

    static int maxPage(int[] ar, int b){

        //check number of students are more than the actual number of books
        if(b > ar.length)
            return -1;
        
        //find minimum page and the total number of pages
        int l = ar[0], h = 0;
        for(int i = 0; i < ar.length; i++){
            if(ar[i] < l)
                l = ar[i];
            
            h = h + ar[i];
        }

        int res = -1;
        while(l <= h){
            int m = (l+h)/2;
            if(isPossibleSol(ar,b,m)){
                res = m;
                h = m - 1;
            }
            else
                l = m + 1;
        }
        return res;
    }

    static boolean isPossibleSol(int[] ar, int b, int m){

        int students = 1, spc = 0;
        for(int i = 0; i < ar.length; i++){

            //check the number of pages is greater than the assumed highest number of page
            if(ar[i] > m)
                return false;
            
            if(spc + ar[i] <= m)
                spc = spc + ar[i];
            else{
                students++;
                if(students > b)
                    return false;
                
                spc = ar[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        int[] ar = {12,34,67,90};
        int b = 2;
        System.out.println(maxPage(ar, b));
    }
}
