public class HuffmanCoder {

    /*
     * You are given a string in java, use it Huffman Encoder to compress it and
     * decode it as well.
     */

    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        
        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        //we'll compare any two nodes with respect to their cose(i.e frequency)
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

}