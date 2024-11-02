package y3.s1.cse222.canvas.m02_stacks_lists_generics;

import java.util.NoSuchElementException;

public class LinkedStack<ItemType> extends Stack<ItemType> {
    private LinearNode<ItemType> top;
    private int n = 0;

    public LinkedStack() {
        top = null;
    }

    @Override
    public void push(ItemType item) {
        LinearNode<ItemType> node = new LinearNode<>(item);
        node.setNext(top);
        top = node;
        n++;
    }

    @Override
    public ItemType pop() {
        if (isEmpty()) throw new NoSuchElementException();
        ItemType element = top.getElement();
        top = top.getNext();
        n--;
        return element;
    }

    public ItemType peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return n;
    }
}
