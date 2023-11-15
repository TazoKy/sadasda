package edu.ISU;

import edu.Person;

public class Teacher extends Person {
    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    private String name;
    private String title="Lecture";
    Teacher(String name){
        this.name=name;
    }
    Teacher(String name,String title){
        this.name=name;
        this.title=title;
    }

}
