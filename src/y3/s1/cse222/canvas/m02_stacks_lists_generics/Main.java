package y3.s1.cse222.canvas.m02_stacks_lists_generics;

public class Main {
    public static void main(String[] args) {
        linkedStackExample();
    }

    public static void fixedCapacityGenericStackExample() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
    }

    public static void linkedStackExample() {
        LinkedStack<Integer> st = new LinkedStack<>();
        st.push(1);
        st.push(5);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
