package com.kumaran.org;

public class DoubleLLNode<T> {

    DoubleLLNode<T> previous;
    DoubleLLNode<T> next;
    T value;

    public DoubleLLNode(){

    }

    public DoubleLLNode(T value) {
        this.value = value;
    }

    public DoubleLLNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLLNode<T> previous) {
        this.previous = previous;
    }

    public DoubleLLNode<T> getNext() {
        return next;
    }

    public void setNext(DoubleLLNode<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
