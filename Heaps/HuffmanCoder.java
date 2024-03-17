import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanCoder {

    /*
    You are given a string in java, use Huffman Encoder to compress it and decode it as well.
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

        // we'll compare any two nodes with respect to their cose(i.e frequency)
        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {

        Map<Character, Integer> fmap = new HashMap<>();

        // find the frequency of each character in the given string and add in the
        // frequency map
        for (int i = 0; i < feeder.length(); i++) {

            char cc = feeder.charAt(i);
            if (fmap.containsKey(cc)) {
                int ov = fmap.get(cc);
                ov += 1;
                fmap.put(cc, ov);
            } else
                fmap.put(cc, 1);
        }

        Heap<Node> minHeap = new Heap<>();
        // by using Set we'll be able to get the set of the frequency map one at a time
        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while(minHeap.size() != 1) {

            // take two minimum nodes, combine them and add back in the heap
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node ft = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    // recursive call to create a heap tree with all the nodes
    private void initEncoderDecoder(Node node, String osf) {

        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initEncoderDecoder(node.left, osf + "0");
        initEncoderDecoder(node.right, osf + "1");
    }

    public String encode(String source) {

        String ans = "";
        for (int i = 0; i < source.length(); i++) {
            ans = ans + encoder.get(source.charAt(i));
        }
        return ans;
    }

    public String decode(String codedString) {
        String key = "";
        String ans = "";
        for (int i = 0; i < codedString.length(); i++) {
            key = key + codedString.charAt(i);
            if (decoder.containsKey(key)) {
                ans = ans + decoder.get(key);
                key = "";
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        
        String str = "abbccda";
        HuffmanCoder hf = new HuffmanCoder(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);
    }
}