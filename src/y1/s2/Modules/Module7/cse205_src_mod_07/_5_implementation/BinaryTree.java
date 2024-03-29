package y1.s2.Modules.Module7.cse205_src_mod_07._5_implementation;

import y1.s2.Modules.Module7.cse205_src_mod_07.EmptyTreeException;
import y1.s2.Modules.Module7.cse205_src_mod_07.Queue;
import y1.s2.Modules.Module7.cse205_src_mod_07.Stack;

public class BinaryTree {
    public static final int INORDER = 0;
    public static final int LEVEL_ORDER = 1;
    public static final int POSTORDER = 2;
    public static final int PREORDER = 3;

    public Node root;

    public BinaryTree() {
        this(0);
    }

    public BinaryTree(int data) {
        this(data, null, null);
    }

    public BinaryTree(int data, BinaryTree left, BinaryTree right) {
        Node leftChild = left == null ? null : left.root;
        Node rightChild = right == null ? null : right.root;
        root = new Node(data, leftChild, rightChild);
    }

    public void clear() {
        prune(root);
        root = null;
    }

    public int getHeight() {
        return getHeight(root);
    }

    protected int getHeight(Node root) {
        int heightLeft = 0, heightRight = 0;
        if (root == null) return 0;
        if (root.hasLeft()) heightLeft = getHeight(root.left) + 1;
        if (root.hasRight()) heightRight = getHeight(root.right) + 1;
        return Math.max(heightLeft, heightRight);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Iterator iterator() {
        return new Iterator(this);
    }

    protected Node findNode(Node root, int data) {
        if (root == null) return null;
        if (root.data == data) return root;
        Node node = findNode(root.left, data);
        if (node != null) return node;
        return findNode(root.right, data);
    }

    public boolean isFull() {
        return isFull(root);
    }

    protected boolean isFull(Node root) {
        if (root.isLeaf()) return true;
        boolean leftFull = root.hasLeft() && isFull(root.left);
        boolean rightFull = root.hasRight() && isFull(root.right);
        return leftFull && rightFull;
    }

    protected void prune(Node root) {
        if (root == null) return;
        prune(root.left);
        root.left = null;
        prune(root.right);
        root.right = null;
    }

    protected void pruneLeft(Node root) {
        prune(root.left);
        root.left = null;
    }

    protected void pruneRight(Node root) {
        prune(root.right);
        root.right = null;
    }

    public void traverse(int which, BinaryTreeVisitor visitor) {
        if (which == LEVEL_ORDER) traverseLevelOrder(root, visitor);
        traverse(which, root, visitor);
    }

    protected void traverse(int which, Node root, BinaryTreeVisitor visitor) {
        if (root == null) return;
        switch (which) {
            case INORDER:
                traverse(which, root.left, visitor);
                visitor.visit(root.data);
                traverse(which, root.right, visitor);
                break;
            case POSTORDER:
                traverse(which, root.left, visitor);
                traverse(which, root.right, visitor);
                visitor.visit(root.data);
                break;
            case PREORDER:
                visitor.visit(root.data);
                traverse(which, root.left, visitor);
                traverse(which, root.right, visitor);
                break;
        }
    }

    protected void traverseLevelOrder(Node root, BinaryTreeVisitor visitor) {
        Queue<Node> nodeQueue = new Queue<>();
        nodeQueue.enqueue(root);
        while (!nodeQueue.isEmpty()) {
            Node newRoot = nodeQueue.dequeue();
            visitor.visit(newRoot.data);
            if (newRoot.hasLeft()) nodeQueue.enqueue(newRoot.left);
            if (newRoot.hasRight()) nodeQueue.enqueue(newRoot.right);
        }
    }

    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node() {
            this(0);
        }

        public Node(int data) {
            this(data, null, null);
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public boolean hasLeft() {
            return left != null;
        }

        public boolean hasRight() {
            return right != null;
        }

        public boolean isLeaf() {
            return !hasLeft() && !hasRight();
        }

        public int getNumChildren() {
            int num = 0;
            if (hasLeft()) ++num;
            if (hasRight()) ++num;
            return num;
        }
    }

    public static class Iterator {
        public Node current;
        public Stack<Node> stack;
        public BinaryTree tree;

        public Iterator(BinaryTree tree) {
            this.tree = tree;
            current = tree.root;
            stack = new Stack<>();
        }

        public void addLeft(int data) throws EmptyTreeException {
            if (tree.isEmpty()) throw new EmptyTreeException();
            pruneLeft();
            current.left = new Node(data);
        }

        public void addRight(int data) throws EmptyTreeException {
            if (tree.isEmpty()) throw new EmptyTreeException();
            pruneRight();
            current.right = new Node(data);
        }

        public boolean find(int data) {
            Node node = tree.findNode(current, data);
            if (node != null) current = node;
            return node != null;
        }

        public int getHeight() {
            return tree.getHeight(current);
        }

        public boolean isFull() {
            return tree.isFull(current);
        }

        public void moveLeft() {
            if (current.hasLeft()) {
                stack.push(current);
                current = current.left;
            }
        }

        public void moveRight() {
            if (current.hasRight()) {
                stack.push(current);
                current = current.right;
            }
        }

        public void moveToRoot() {
            stack.clear();
            current = tree.root;
        }

        public void moveUp() {
            current = stack.pop();
        }

        public void prune() {
            pruneLeft();
            pruneRight();
        }

        public void pruneLeft() {
            tree.pruneLeft(current);
        }

        public void pruneRight() {
            tree.pruneRight(current);
        }

        public void traverse(int which, BinaryTreeVisitor visitor) {
            tree.traverse(which, current, visitor);
        }
    }
}
