package ru.johnnygomezzz.lesson2;

public class Lesson2Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new MyLinkedList<>();
        ArrayList<String> arrayList = new MyArrayList<>();

        linkedList.add(8);
        linkedList.add(6);
        linkedList.add(89);
        linkedList.insertFirstElement(33);
        linkedList.insertFirstElement(44);
        linkedList.insertFirstElement(55);

        linkedList.display();

        System.out.println(linkedList.size());
        System.out.println(linkedList.contains(8));

        linkedList.removeFirstElement();
        System.out.println(linkedList.getFirstElement());
        System.out.println(linkedList.getLastElement());

        linkedList.removeLastElement();
        linkedList.remove(33);

        linkedList.display();

        System.out.println("---------------------------------\n");

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        arrayList.display();

        System.out.println(arrayList.get(1));

        arrayList.remove(2);

        arrayList.display();

        System.out.println(arrayList.size());
    }
}
