// src/main/java/com/example/studentservice/model/Student.java

package com.example.studentservice.model;

public class Student {
    private Long id;
    private String name;
    private int age;
    private String major;
    private String role;







    public Student(Long id, String name, int age, String major, String role ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.role = role;





    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String getRole() {
        return role;

    }




    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setRole(String role) {
        this.role = role;
    }





}










