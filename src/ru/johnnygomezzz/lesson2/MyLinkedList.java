package ru.johnnygomezzz.lesson2;

public class MyLinkedList<E> implements LinkedList<E>{

    public Node<E> firstElement;
    public int size;

    @Override
    public void insertFirstElement(E val) {
        firstElement = new Node<>(val, firstElement);
        size++;
    }

    @Override
    public void insertLastElement(E val) {

    }

    @Override
    public E getFirstElement() {
        return null;
    }

    @Override
    public E getLastElement() {
        return null;
    }

    @Override
    public E removeFirstElement() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = firstElement;
        firstElement = removedNode.nextNode;
        removedNode.nextNode = null;

        size--;
        return removedNode.item;
    }

    @Override
    public E removeLastElement() {
        return null;
    }

    @Override
    public boolean remove(E val) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(E val) {
        Node<E> currentElement = firstElement;
        while (currentElement != null) {
            if (currentElement.item.equals(val)) {
                return true;
            }
            currentElement = currentElement.nextNode;
        }
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
