package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

class Node<Key extends Comparable<Key>, Value> {
    Key key;
    Value value;
    Node<Key, Value> left, right;
    int size;

    public Node(Key key, Value value, int size) {
        this.key = key;
        this.value = value;
        this.size = size;
    }
}
