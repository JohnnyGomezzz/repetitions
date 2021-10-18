package ru.johnnygomezzz.lesson2;

public class MyArrayList<E> implements ArrayList<E>{
    private final int SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[SIZE];
    private int pointer = 0;

    @Override
    public void add(E item) {
        if (pointer == array.length-1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void remove(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(array, index + 1, array, index, pointer - index);
        }
        array[pointer] = null;
        pointer--;
        if (array.length > SIZE && pointer < array.length / CUT_RATE) {
            resize(array.length / 2);
        }
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < pointer; i++) {
            sb.append(array[i]);
            if (array[i + 1] != null) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
