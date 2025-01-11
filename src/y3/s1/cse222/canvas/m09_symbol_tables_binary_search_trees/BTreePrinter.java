package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BTreePrinterTest {

    private static Node<String, Integer> test1() {
        Node<String, Integer> root = new Node<String, Integer>("",2);
        Node<String, Integer> n11 = new Node<String, Integer>("",7);
        Node<String, Integer> n12 = new Node<String, Integer>("",5);
        Node<String, Integer> n21 = new Node<String, Integer>("",2);
        Node<String, Integer> n22 = new Node<String, Integer>("",6);
        Node<String, Integer> n23 = new Node<String, Integer>("",3);
        Node<String, Integer> n24 = new Node<String, Integer>("",6);
        Node<String, Integer> n31 = new Node<String, Integer>("",5);
        Node<String, Integer> n32 = new Node<String, Integer>("",8);
        Node<String, Integer> n33 = new Node<String, Integer>("",4);
        Node<String, Integer> n34 = new Node<String, Integer>("",5);
        Node<String, Integer> n35 = new Node<String, Integer>("",8);
        Node<String, Integer> n36 = new Node<String, Integer>("",4);
        Node<String, Integer> n37 = new Node<String, Integer>("",5);
        Node<String, Integer> n38 = new Node<String, Integer>("",8);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;
        n12.left = n23;
        n12.right = n24;

        n21.left = n31;
        n21.right = n32;
        n22.left = n33;
        n22.right = n34;
        n23.left = n35;
        n23.right = n36;
        n24.left = n37;
        n24.right = n38;

        return root;
    }

    private static Node<String, Integer> test2() {
        Node<String, Integer> root = new Node<String, Integer>("1",2);
        Node<String, Integer> n11 = new Node<String, Integer>("2",7);
        Node<String, Integer> n12 = new Node<String, Integer>("3",5);
        Node<String, Integer> n21 = new Node<String, Integer>("4",2);
        Node<String, Integer> n22 = new Node<String, Integer>("5",6);
        Node<String, Integer> n23 = new Node<String, Integer>("6",9);
        Node<String, Integer> n31 = new Node<String, Integer>("7",5);
        Node<String, Integer> n32 = new Node<String, Integer>("8",8);
        Node<String, Integer> n33 = new Node<String, Integer>("9",4);

        root.left = n11;
        root.right = n12;

        n11.left = n21;
        n11.right = n22;

        n12.right = n23;
        n22.left = n31;
        n22.right = n32;

        n23.left = n33;

        return root;
    }

    public static void main(String[] args) {

        BTreePrinter.printNode(test1());
        BTreePrinter.printNode(test2());

    }
}

/**
 * Node class represents a single node in the binary search tree.
 */
class Node<Key, Value> {
    Key key;
    Value value;
    Node<Key, Value> left;
    Node<Key, Value> right;
    public Node(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}

public class BTreePrinter {

    public static <Key, Value extends Comparable<?>> void printNode(Node<Key, Value> root) {
        int maxLevel = maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <Key, Value extends Comparable<?>> void printNodeInternal(List<Node<Key, Value>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        List<Node<Key, Value>> newNodes = new ArrayList<>();
        for (Node<Key, Value> node : nodes) {
            if (node != null) {
                System.out.print(node.value);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    printWhitespaces(1);

                printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    printWhitespaces(1);

                printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <Key, Value extends Comparable<?>> int maxLevel(Node<Key, Value> node) {
        if (node == null)
            return 0;

        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
}