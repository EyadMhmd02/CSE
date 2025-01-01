package y3.s1.cse222.canvas.m10_hash_tables;

public class LinearProbingHashST<Key, Value> {
    private Key[] keys;
    private Value[] vals;

    public LinearProbingHashST(int size) {
        keys = (Key[]) new Object[size];
        vals = (Value[]) new Object[size];
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % keys.length;
    }

    public void put(Key key, Value value) {
        int i;
        for (i = hash(key); keys[i] != null; i = (i + 1) % keys.length) {
            if (keys[i].equals(key)) {
                vals[i] = value;
                return;
            }
        }
        keys[i] = key;
        vals[i] = value;
    }

    public Value get(Key key) {
        for (int i = hash(key); keys[i] != null; i = (i + 1) % keys.length) {
            if (keys[i].equals(key)) return vals[i];
        }
        return null;
    }
}
