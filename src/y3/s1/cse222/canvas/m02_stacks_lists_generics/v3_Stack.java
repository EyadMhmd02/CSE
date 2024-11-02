package y3.s1.cse222.canvas.m02_stacks_lists_generics;

import java.util.Arrays;

class v3_Stack<Item> {
    private Item[] data;
    private int n = 0;

    public v3_Stack() {
        data = (Item[]) new Object[100];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Item item) {
        if (data.length == n) resize();
        data[n++] = item;
    }

    public Item pop() {
        return data[--n];
    }

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }
}
