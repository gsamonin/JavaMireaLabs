package com.company;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author() {}
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String mail) {
        email = email;
    }
    public String toString(){
        return name + " " + this.gender + " " + "at " + this.email;
    }
}