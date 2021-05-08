package Entities;

import Abstracts.Entity;

import java.util.Date;

public class Customer implements Entity {
    int id;
    private String firstName;
    private String LastName;
    private Date birthDate;
    private String nationalityId;

    public Customer(){

    }

    public Customer(int id, String firstName, String lastName, Date birthDate, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        LastName = lastName;
        this.birthDate = birthDate;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
