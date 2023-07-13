package pojos.contactPojos;

public class Sort {
    public boolean empty;
    public boolean sorted;
    public boolean unsorted;

    public Sort(boolean empty, boolean sorted, boolean unsorted) {
        this.empty = empty;
        this.sorted = sorted;
        this.unsorted = unsorted;
    }

    public Sort() {
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    public boolean isUnsorted() {
        return unsorted;
    }

    public void setUnsorted(boolean unsorted) {
        this.unsorted = unsorted;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "empty=" + empty +
                ", sorted=" + sorted +
                ", unsorted=" + unsorted +
                '}';
    }
}
