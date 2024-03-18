public class SquareRootDecomposition {

    /*
     * Suppose we are given an array of integers and you are asked to find either
     * the sum,difference,average of
     * elements from the index range idx1 to idx2.
     * 
     * Example arr = {1,3,5,2,7,6,1,4,8}
     * sum(2,7) O/P = 25
     */

    public static void bulidBlocks(int[] arr) {

        int n = arr.length;
        // build a blocks array
        int sqrt = (int) Math.sqrt(n);
        int block_id = -1;

        int[] blocks = new int[sqrt + 2];

        // add sum of given array in blocks
        for (int i = 0; i < n; i++) {
            // If new block starts increase block size
            if (i % sqrt == 0) {
                block_id++;
            }
            blocks[block_id] += arr[i];
        }

        System.out.println(query(blocks, arr, 2, 7, 3));
    }

    public static int query(int[] blocks, int[] arr, int l, int r, int sqrt) {

        int ans = 0;
        // check left part
        while (l % sqrt != 0 && l < r && l != 0) {
            ans += arr[l];
            l++;
        }

        // check midle part
        while (l + sqrt <= r) {
            ans += blocks[l / sqrt];
            l += sqrt;
        }

        // check right part
        while (l <= r) {
            ans += arr[l];
            l++;
        }
        return ans;
    }

    public void update(int[] blocks, int[] arr, int i, int val, int sqrt) {
        
        int block_id = i / sqrt;
        blocks[block_id] += (val - arr[i]);
        arr[i] = val;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 7, 6, 3, 1, 4, 8};
        bulidBlocks(arr);
    }
}