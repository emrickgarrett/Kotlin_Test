package java_files;

import java.util.*;

/**
 * Created by Garrett on 5/26/2015.
 *
 * Just a representation of a person
 */
public class Person {

    private int age;
    private String first;
    private String last;
    private double weight;
    private ArrayList<String> siblings = new ArrayList<String>();


    public Person(){
        age = 0;
        first = "default";
        last = "default";
        weight = 0.0;
    }

    public Person(int age, String first, String last, double weight, ArrayList<String> siblings){
        this.age = age;
        this.first = first;
        this.last = last;
        this.weight = weight;
        this.siblings = new ArrayList<String>(siblings);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSiblings(ArrayList<String> siblings) {
        this.siblings = siblings;
    }

    public int getAge() {

        return age;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public double getWeight() {
        return weight;
    }

    public ArrayList<String> getSiblings() {
        return siblings;
    }
}
