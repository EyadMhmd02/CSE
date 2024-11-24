package y3.s1.cse222.canvas.m05_elementary_sorts;

class Date implements Comparable<Date> {
    private final int day, month, year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    @Override
    public int compareTo(Date that) {
        if (that.getClass() != this.getClass())
            throw new ClassCastException();
        if (this.year > that.year) return -1;
        if (this.year < that.year) return +1;
        if (this.month > that.month) return -1;
        if (this.month < that.month) return +1;
        if (this.day > that.day) return -1;
        if (this.day < that.day) return +1;
        return 0;
    }
}

class ComparableExample {
    public static void main(String[] args) {
        Date eyad = new Date(23, 6, 2002);
        Date omar = new Date(20, 11, 1995);
        Date mohsen = new Date(20, 11, 1995);

        System.out.println(omar.compareTo(mohsen));
    }
}
