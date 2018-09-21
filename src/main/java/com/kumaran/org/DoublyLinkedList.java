package com.kumaran.org;

public class DoublyLinkedList<T> {

    DoubleLLNode<T> front;
    DoubleLLNode<T> rear;

    public DoublyLinkedList(){
        this.front = new DoubleLLNode<T>();
        this.rear = new DoubleLLNode<T>();
    }


    public DoubleLLNode<T> getFront() {
        return front;
    }

    public void setFront(DoubleLLNode<T> front) {
        this.front = front;
    }

    public DoubleLLNode<T> getRear() {
        return rear;
    }

    public void setRear(DoubleLLNode<T> rear) {
        this.rear = rear;
    }

    public void addToFront(T value) {

    }

    public void addToRear(T value){

    }

    public void deleteAtFront(){

    }

    public void deleteAtEnd(){

    }
}
