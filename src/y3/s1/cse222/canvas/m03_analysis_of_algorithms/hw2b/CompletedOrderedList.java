package y3.s1.cse222.canvas.m03_analysis_of_algorithms.hw2b;

/**
 * CompletedOrderedList represents an implementation of an ordered list that builds on
 * CompletedList.
 *
 * @author Eyad Mohamed AbdelMohsen Ghanem
 * @version 1.0
 */
class CompletedOrderedList<T extends Comparable<T>> extends CompletedList<T> implements OrderedListADT<T> {
    @Override
    public void add(T element) {
        DoubleLinearNode<T> newNode = new DoubleLinearNode<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
        }
        tail = newNode;
        count++;
        modChange++;
    }
}
