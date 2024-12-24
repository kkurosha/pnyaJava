class ComparableElement implements Comparable<ComparableElement> {
    private int value;

    public ComparableElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(ComparableElement other) {
        return Integer.compare(this.value, other.value);
    }
}
