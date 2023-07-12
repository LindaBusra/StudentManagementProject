package pojos.contactPojos;

import java.util.ArrayList;

public class Root {
    public ArrayList<Content> content;
    public boolean empty;
    public boolean first;
    public boolean last;
    public int number;
    public int numberOfElements;
    public Pageable pageable;
    public int size;
    public Sort sort;
    public int totalElements;
    public int totalPages;

    public Root(ArrayList<Content> content, boolean empty, boolean first, boolean last, int number, int numberOfElements, Pageable pageable, int size, Sort sort, int totalElements, int totalPages) {
        this.content = content;
        this.empty = empty;
        this.first = first;
        this.last = last;
        this.number = number;
        this.numberOfElements = numberOfElements;
        this.pageable = pageable;
        this.size = size;
        this.sort = sort;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
    }

    public Root() {
    }

    public ArrayList<Content> getContent() {
        return content;
    }

    public void setContent(ArrayList<Content> content) {
        this.content = content;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public String toString() {
        return "Root{" +
                "content=" + content +
                ", empty=" + empty +
                ", first=" + first +
                ", last=" + last +
                ", number=" + number +
                ", numberOfElements=" + numberOfElements +
                ", pageable=" + pageable +
                ", size=" + size +
                ", sort=" + sort +
                ", totalElements=" + totalElements +
                ", totalPages=" + totalPages +
                '}';
    }
}
