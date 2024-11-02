package y3.s1.cse222.canvas.m02_stacks_lists_generics;

class v1_FixedCapacityStringStack {
    private String[] data;
    private int n = 0;

    public v1_FixedCapacityStringStack(int cap) {
        data = new String[cap];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(String item) {
        data[n++] = item;
    }

    public String pop() {
        return data[--n];
    }
}
