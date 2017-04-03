package com.example.nishant.animation;

/**
 * Created by nishant on 1/27/2017.
 */
public abstract class Employee {

    private String name;
    private String address;
    private String dob; // please enter in format DD/MM/YYYY
    private String gender; //Male or Female
    protected int salary;
    public static int count;

    public Employee() {
        count = count + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    protected abstract int getSalary();

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

