package ru.johnnygomezzz.lesson2;

public interface LinkedList<E> {
    void insertFirstElement(E val);

    void insertLastElement(E val);

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

        public Node(E item, Node<E> nextNode) {
            this.item = item;
            this.nextNode = nextNode;
        }
    }
}
