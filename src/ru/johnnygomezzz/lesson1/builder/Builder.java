package ru.johnnygomezzz.lesson1.builder;

public class Builder {
    String firstName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    int age;
    String gender;

    public Builder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public Builder country(String country) {
        this.country = country;
        return this;
    }

    public Builder address(String address) {
        this.address = address;
        return this;
    }

    public Builder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public Person build() {
        return new Person(this);
    }


}
