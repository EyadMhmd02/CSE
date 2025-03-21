package y3.s1.cse222.canvas.m03_analysis_of_algorithms.hw2b;

/**
 * OrderedListADT defines the interface to an ordered list collection. Only Comparable elements
 * are stored, kept in the order determined by the inherent relationship among the elements.
 *
 * @author Lewis and Chase, Acuna
 * @version 5.0
 */
public interface OrderedListADT<T> extends ListADT<T> {
    /**
     * Adds the specified element to this collection at the proper location
     *
     * @param element the element to be added to this collection
     * @throws NullPointerException if element is null
     */
    void add(T element) throws NullPointerException;
}
