package com.company.classwork;
//Create a simple Dog class calledDog in your com.company.classwork package.
public class Dog {

//An Dog should have name, bred, age and color properties
//All properties should be able to be set via a Constructor
//There should be getter methods for all properties
//There should be a method to pretty print the properities of the dog

    private String name;
    private String breed;
    private int age;
    private String color;

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBreed(String newBreed) {
        this.breed = newBreed;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public void printDog() {
        System.out.println(this.name + " is a " + this.age + " year old " + this.color + " " + this.breed );
    }

    public String getName() {
        return name;
    }


}
