import java.util.ArrayList;
import java.util.LinkedList;

public class HasmapBasicImpliment {

    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }



        // Put FUNCTION
        // Get the index of the array in which the key is to be stored
        public int HashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // Het the LL in that particular array Index where the key is:
        public int SearchIndex(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        // Rehashing fucion
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldbuck[] = buckets;
            N = 2 * N;
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // adding into these buckets
            for (int i = 0; i < oldbuck.length; i++) {
                LinkedList<Node> ll = oldbuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }


        public void put(K key, V value) {
            int bi = HashFunction(key);
            int di = SearchIndex(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        


        //CONTAINS KEY
        public boolean containsKey(K key)
        {
            int bi = HashFunction(key);
            int di = SearchIndex(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V get (K key)
        {
            int bi = HashFunction(key);
            int di = SearchIndex(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key)
        {
            int bi = HashFunction(key);
            int di = SearchIndex(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }


        public ArrayList<K> keySet()
        {
            ArrayList<K> keys =  new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for(Node node: ll)
                {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty()
        {
            return n == 0;
        }
    }


    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for(String key : keys)
        {
            System.out.println(key);
        }
    }
}