package tStack;

public class TNodeStack<E> {
    protected E Data;
    protected TNodeStack<E> prev;

    public TNodeStack(E data, TNodeStack<E> ref) {
        Data = data;
        this.prev = ref;
    }

    public E getData() {
        return Data;
    }

    public void setData(E data) {
        Data = data;
    }

    public TNodeStack<E> getPrev() {
        return prev;
    }

    public void setPrev(TNodeStack<E> prev) {
        this.prev = prev;
    }
}
