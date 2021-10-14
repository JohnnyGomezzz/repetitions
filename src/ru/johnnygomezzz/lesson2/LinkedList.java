package ru.johnnygomezzz.lesson2;

public interface LinkedList<E> {

    void add(E val);

    void insertFirstElement(E val);

    E getFirstElement();

    E getLastElement();

    E removeFirstElement();

    E removeLastElement();

    boolean remove(E val);

    boolean isEmpty();

    boolean contains(E val);

    int size();

    class Node<E> {
        E item;
        Node<E> nextNode;
        Node<E> prevNode;

        public Node(Node<E> prevNode, E item, Node<E> nextNode) {
            this.prevNode = prevNode;
            this.item = item;
            this.nextNode = nextNode;
        }
    }

    void display();
}
