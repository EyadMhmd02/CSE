package y3.s1.cse222.canvas.m01_java_review_data_abstraction._1_java_review._3_recursion.printing_a_list;

class LinearNode {
    private Object element;
    private LinearNode next;

    public LinearNode(Object element, LinearNode next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public LinearNode getNext() {
        return next;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(LinearNode next) {
        this.next = next;
    }

    public String toString() {
        return element.toString();
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;

        if (o instanceof LinearNode other) {
            return element.equals(other.element) && next.equals(other.next);
        }

        return false;
    }
}
