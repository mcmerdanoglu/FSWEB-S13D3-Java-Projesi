package Answers;

public class Person {

    String firstname;
    String lastName;
    int age;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    String occupation;
    int iqLevel;
    boolean isSmoker;

    //Overload
    public Person(String firstname, String lastName, int age, String occupation, int iqLevel, boolean isSmoker) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.iqLevel = iqLevel;
        this.isSmoker = isSmoker;
    }

    boolean isMarried;

    public Person(String firstname, String lastName, int age, String occupation, int iqLevel, boolean isSmoker, boolean isMarried) {
        //constructor chaining. (Constructor body'de En üstte yer almalı)
        this(firstname, lastName, age, occupation, iqLevel, isSmoker);
        this.isMarried = isMarried;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age>=13 && age<=19) return true;
        else return false;
    }
}
