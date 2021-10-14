package ru.johnnygomezzz.lesson2;

public class Lesson2Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(6);
        linkedList.insertFirstElement(33);
        linkedList.insertFirstElement(44);
        linkedList.insertFirstElement(55);

        linkedList.display();
        System.out.println(linkedList.size());
        System.out.println(linkedList.contains(8));
    }
}
