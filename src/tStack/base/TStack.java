package tStack.base;

import tStack.TNodeStack;

import java.util.EmptyStackException;

public class TStack<E> implements InterStack<E> {
    protected TNodeStack<E> top;

    public TStack() {
    }

    @Override
    public E top() {
        if( top == null )
        {
            throw new EmptyStackException();
        } else {
            return top.getData();
        }
    }

    @Override
    public E pop() {
        if( top == null ) {
            throw new EmptyStackException();
        } else {
            E dataOut = top.getData();
            top = top.getPrev();
            return dataOut;
        }
    }

    @Override
    public void push(E item) {
        if( top == null ) {
            top = new TNodeStack<>(item,null);
        } else {
            var refNode = new TNodeStack<E>(item,top);
            top = refNode;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        int counter = 0;
        TNodeStack<E> refNode = top;

        while (refNode != null){
            counter++;
            refNode = refNode.getPrev();
        }
        return counter;
    }

    @Override
    public int deepLevel(E item) {
        return 0; //todo: praca domowa
    }
}
