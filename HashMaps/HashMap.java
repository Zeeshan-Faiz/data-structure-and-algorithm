import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

    ArrayList<LinkedList<Entity>> list;

    private int size = 0;
    private float lf = 0.5f;

    public HashMap() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
