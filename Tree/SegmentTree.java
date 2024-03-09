public class SegmentTree {

    /*
     * A Segment Tree is a data structure that stores information about array intervals as a tree.
     * This allows answering range queries over an array efficiently, while still
     * being flexible enough to allow quick modification of the array.
     */

    private static class Node {

        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        //create a tree using this array
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {

        //leaf node
        if (start == end) {
            Node leaf = new Node(start, end);// here both start and end are equal
            leaf.data = arr[start];
            return leaf;
        }

        //create new node with index you are at
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {

        String str = "";

        if (node.left != null)
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: "
                    + node.left.data + " => ";

        else
            str = str + "No left child";

        //for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if (node.right != null)
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: "
                    + node.right.data;

        else
            str = str + "No right child";

        System.out.println(str + '\n');

        //call recursively for whole tree
        if (node.left != null)
            display(node.left);

        if (node.right != null)
            display(node.right);
    }

    //Query to find sum within a given range
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        
        //When node is completely lying inside query interval, return the data
        if (node.startInterval >= qsi && node.endInterval <= qei)
            return node.data;
        //if node is completely outside, return 0
        else if (node.startInterval > qei || node.endInterval < qsi) 
            return 0;
        //If there is some overlapping between the intervals, take the only node that comes withtin the interval
        else 
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);  
    }

    //Update the data at a given index
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        
        //When the given index is withing the interval range of current node
        if (index >= node.startInterval && index <= node.endInterval) {
            
            //When you reach the leaf node of the given index just update it's data
            if (index == node.startInterval && index == node.endInterval) 
            {
                node.data = value;
                return node.data;
            } 
            //or else update the upper node's data which might get change due to a change in leaf data
            else 
            {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        // the given index doesn't lie within the range, therefore just return the node's data unchanged
        return node.data;
    }

    public static void main(String[] args) {
        
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        //tree.display();

        System.out.println(tree.query(1, 6));
    }
}