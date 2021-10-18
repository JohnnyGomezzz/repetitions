package ru.johnnygomezzz.lesson1.builder;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;

    Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.middleName = builder.middleName;
        this.country = builder.country;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    @Override
    public String toString() {
        return "Person{\n" +
                "firstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \nmiddleName='" + middleName + '\'' +
                ", \ncountry='" + country + '\'' +
                ", \naddress='" + address + '\'' +
                ", \nphone='" + phone + '\'' +
                ", \nage=" + age +
                ", \ngender='" + gender + '\'' +
                "\n}";
    }
}
