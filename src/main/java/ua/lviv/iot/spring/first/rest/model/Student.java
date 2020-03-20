package ua.lviv.iot.spring.first.rest.model;

public class Student {
    private String firstname;
    private String lastName;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {

    }

    public Student(String firstname, String lastName, int id) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
