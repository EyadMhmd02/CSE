package y3.s1.cse222.canvas.m02_stacks_lists_generics;

class v2_FixedCapacityStack<Item> {
    private Item[] data;
    private int n = 0;

    public v2_FixedCapacityStack(int cap) {
        data = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Item item) {
        data[n++] = item;
    }

    public Item pop() {
        return data[--n];
    }
}
