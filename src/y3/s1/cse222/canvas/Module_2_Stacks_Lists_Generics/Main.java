package y3.s1.cse222.canvas.Module_2_Stacks_Lists_Generics;

class Main {
    public static void main(String[] args) {
        FixedCapacityStringStack s = new FixedCapacityStringStack(5);
        s.push("one");
        s.push(2);
        s.push(2.0);
        s.push(4.5f);
        s.push(true);
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

    /*
    4
    1
    */
}
