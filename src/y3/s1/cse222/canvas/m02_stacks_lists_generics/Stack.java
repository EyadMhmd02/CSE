package y3.s1.cse222.canvas.m02_stacks_lists_generics;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;

class Stack<Item> implements Iterable<Item> {
    private Item[] data;
    private int n = 0;

    public Stack() {
        data = (Item[]) new Object[100];
    }

    public boolean isEmpty() { // O(1)
        return n == 0;
    }

    public void push(Item item) { // O(1) amortized
        if (data.length == n) resize();
        data[n++] = item;
    }

    public Item pop() { // O(1)
        if (isEmpty()) throw new EmptyStackException();
        return data[--n];
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = n;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return data[--i];
        }

        public void remove() { /* not supported */ }
    }
}
