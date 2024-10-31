package y3.s1.cse222.canvas.Module_2_Stacks_Lists_Generics;

public class FixedCapacityStringStack<Item> {
    private Item[] data;
    private int n = 0;

    public FixedCapacityStringStack(int cap) {
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
