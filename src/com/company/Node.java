package com.company;
public class Node<T> {
    private T value;       // ערך החוליה הנוכחית
    private Node<T> next; // הפניה לחוליה הבאה

    public Node(T value) { // בונה חוליה חדשה
        this.value = value;
        this.next = null;
    }
    public Node(T value, Node<T> next) { // בונה חוליה חדשה
        this.value = value;
        this.next = next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}