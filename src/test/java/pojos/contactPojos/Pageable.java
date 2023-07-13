package pojos.contactPojos;

public class Pageable {
    public int offset;
    public int pageNumber;
    public int pageSize;
    public boolean paged;
    public Sort sort;
    public boolean unpaged;

    public Pageable(int offset, int pageNumber, int pageSize, boolean paged, Sort sort, boolean unpaged) {
        this.offset = offset;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.paged = paged;
        this.sort = sort;
        this.unpaged = unpaged;
    }

    public Pageable() {
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isPaged() {
        return paged;
    }

    public void setPaged(boolean paged) {
        this.paged = paged;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public boolean isUnpaged() {
        return unpaged;
    }

    public void setUnpaged(boolean unpaged) {
        this.unpaged = unpaged;
    }

    @Override
    public String toString() {
        return "Pageable{" +
                "offset=" + offset +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", paged=" + paged +
                ", sort=" + sort +
                ", unpaged=" + unpaged +
                '}';
    }
}
