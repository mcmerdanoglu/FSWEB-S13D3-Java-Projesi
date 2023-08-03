package Main;

import Answers.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Person person1 = new Person("Jim","Dough",18,
                "developer",200, false, true);

        Person person2 = new Person("John", "Doe", 20);

        System.out.println("Person Info---------------");
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Age: " + person2.getAge());
        System.out.println("isTeen: " + person1.isTeen());
        System.out.println("isTeen: " + person2.isTeen());
    }


}