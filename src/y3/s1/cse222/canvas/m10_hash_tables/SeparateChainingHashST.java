package y3.s1.cse222.canvas.m10_hash_tables;

public class SeparateChainingHashST<Key, Value> {
    private SequentialSearchST<Key, Value>[] st;
    private int M;

    public SeparateChainingHashST(int M) {
        this.M = M;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[M];
        for (int i = 0; i < M; i++) {
            st[i] = new SequentialSearchST<>();
        }
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void put(Key key, Value value) {
        st[hash(key)].put(key, value);
    }

    public Value get(Key key) {
        return st[hash(key)].get(key);
    }
}