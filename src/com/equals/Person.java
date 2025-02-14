package com.equals;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Person){
           Person person = (Person)obj;
           if(person.getName().equals(this.name) && person.getAge() == this.age && person.getGender() == this.gender){
               return true;
           }
           else{
               return false;
           }
       }

       else{
           return obj == this;
       }
    }
}
