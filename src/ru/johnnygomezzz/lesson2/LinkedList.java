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

    int size();
}
