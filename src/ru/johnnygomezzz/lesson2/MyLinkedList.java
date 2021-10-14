package ru.johnnygomezzz.lesson2;

public class MyLinkedList<E> implements LinkedList<E>{

    public Node<E> firstElement;
    public Node<E> lastElement;
    public int size;

    @Override
    public void add(E val) {
        if (isEmpty()) {
            firstElement = new Node<>(null, val, null);
            lastElement = firstElement;
            size++;
        }
        lastElement = new Node<>(lastElement.nextNode, val, null);
        size++;
    }

    @Override
    public void insertFirstElement(E val) {
        firstElement = new Node<>(null, val, firstElement);
        size++;
    }

    @Override
    public E getFirstElement() {
        if (firstElement != null) {
            return firstElement.item;
        }
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
    public boolean remove(E val) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
        return size;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> currentNode = firstElement;
        while (currentNode != null) {
            sb.append(currentNode.item);
            if (currentNode.nextNode != null) {
                sb.append(", ");
            }
            currentNode = currentNode.nextNode;
        }
        sb.append("]");
        return sb.toString();
    }
}
