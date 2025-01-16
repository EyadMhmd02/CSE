package y3.s1.cse222.canvas.m09_symbol_tables_binary_search_trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTreePrinter {
    /**
     * Prints the values of the nodes in the binary search tree in a visually appealing manner.
     * The values are printed using an in-order traversal of the tree.
     *
     * @param root The root of the binary search tree.
     * @param <Key> The type of keys in the tree.
     * @param <Value> The type of values in the tree. It must extend Comparable for comparison.
     *
     * @throws NullPointerException If the root is null.
     */
    public <Key, Value extends Comparable<?>> void print(Node<Key, Value> root, boolean printKeys) {
        if (root == null) {
            throw new NullPointerException("The root cannot be null.");
        }

        int maxLevel = maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel, printKeys);
    }

    /**
     * Prints the nodes of a binary tree in a visually appealing manner.
     * This method uses an in-order traversal of the tree and prints the values of the nodes.
     *
     * @param nodes The list of nodes to be printed.
     * @param level The current level of the nodes in the tree.
     * @param maxLevel The maximum level of the tree.
     *
     * @throws NullPointerException If the list of nodes is null or empty.
     * @throws IllegalArgumentException If the maximum level is less than or equal to 0.
     */
    private <Key, Value extends Comparable<?>> void printNodeInternal(List<Node<Key, Value>> nodes, int level, int maxLevel, boolean printKeys) {
        if (nodes.isEmpty() || isAllElementsNull(nodes))
            return;

        if (maxLevel <= 0) {
            throw new IllegalArgumentException("The maximum level must be greater than 0.");
        }

        int floor = maxLevel - level;
        int edgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        List<Node<Key, Value>> newNodes = new ArrayList<>();
        for (Node<Key, Value> node : nodes) {
            if (node != null) {
                System.out.print(printKeys ? node.key + ":" + node.value : node.value);
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

        for (int i = 1; i <= edgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    printWhitespaces(edgeLines + edgeLines + i + 1);
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

                printWhitespaces(edgeLines + edgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel, printKeys);
    }

    /**
     * Prints a specified number of whitespace characters to the console.
     *
     * <p>This method is used to format the output of the binary search tree visualization. It iterates through the specified
     * number of times and prints a single whitespace character for each iteration. This helps to create the necessary spacing
     * between nodes in the printed representation of the tree.
     *
     * @param count The number of whitespace characters to print.
     */
    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    /**
     * Calculates the maximum level of a binary tree.
     *
     * <p>This method recursively calculates the maximum level of a binary tree by comparing the maximum levels of the left
     * and right subtrees and adding 1 to the result. The base case is when the node is null, in which case the maximum
     * level is 0.
     *
     * @param node The root of the binary tree or subtree.
     * @return The maximum level of the binary tree or subtree.
     */
    private static <Key, Value extends Comparable<?>> int maxLevel(Node<Key, Value> node) {
        if (node == null)
            return 0;

        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
    }

    /**
     * Checks if all elements in a given list are null.
     *
     * <p>This method iterates through the elements of the list and checks if each element is null. If any element is not
     * null, the method returns false. If all elements are null, the method returns true.
     *
     * @param list The list to check for null elements.
     * @return {@code true} if all elements in the list are null; {@code false} otherwise.
     */
    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
}
