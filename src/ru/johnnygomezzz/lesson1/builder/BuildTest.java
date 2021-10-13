package ru.johnnygomezzz.lesson1.builder;

public class BuildTest {
    public static void main(String[] args) {
        Person firstPerson = new Builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .gender("male")
                .age(30)
                .build();

        System.out.println(firstPerson.toString());
    }
}
