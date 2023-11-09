package org.chdtu;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';

    }
}
