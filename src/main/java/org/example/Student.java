package org.example;

import java.util.ArrayList;

public class Student {
    private long id ;
    private String name ;
    private ArrayList <Integer> grids;
    private ArrayList<Integer> railings;

    public Student ( long id , String name) {
        this.id = id ;
        this.name = name ;
        this.grids=new ArrayList<>();
    }
    public long getId () {
        return this . id ;
    }
    public String getName () {
        return this . name ;
    }
    public ArrayList<Integer> getGrades () {
        return this . grids ;
    }
    public void addGrade ( int grade) {
        this.grids.add(grade) ;
    }
    public double getGradeAverage () {
        double sum = 0 ;
        for ( int grade: this.grids ) {
            sum += grade ;
        }
        return sum / this.grids.size ( ) ;
    }
}
