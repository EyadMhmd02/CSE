package y2.s1.priv_lessons;

public class LogicGates {
    public static void main(String[] args) {
        boolean A, B;

        A = true;
        B = false;

        boolean AND = A && B,
                OR = A || B,
                NAND = !(AND),
                NOR = !(OR),
                XOR = A ^ B,
                XNOR = !(XOR);

        int and = AND ? 1 : 0,
                or = OR ? 1 : 0,
                nand = NAND ? 1 : 0,
                nor = NOR ? 1 : 0,
                xor = XOR ? 1 : 0,
                xnor = XNOR ? 1 : 0;

        System.out.printf("AND\t\t=\t%d%n", and);
        System.out.printf("OR\t\t=\t%d%n", or);
        System.out.printf("NAND\t=\t%d%n", nand);
        System.out.printf("NOR\t\t=\t%d%n", nor);
        System.out.printf("XOR\t\t=\t%d%n", xor);
        System.out.printf("XNOR\t=\t%d%n", xnor);
    }
}
