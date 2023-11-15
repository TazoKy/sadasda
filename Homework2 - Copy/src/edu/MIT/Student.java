package edu.MIT;

import edu.Person;

public class Student extends Person {
    private  String name;
    private double score;

    public Student (String name,double score){
        this.score =score;
        this.name=name;
    }
    public Integer grade(){
        if (score >= 85 && score <= 100) {
            return   4;
        } else if (score >= 75 && score < 85) {
            return   3;
        } else if (score >= 65 && score < 75) {
            return   2;
        } else if (score >= 55 && score < 65) {
            return   1;
        } else if (score >= 0 && score < 55) {
            return   0;
        } else {
            return -1;
        }

    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }

}