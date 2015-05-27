package kotlin_files

import java.util.*;

/**
 * Created by Garrett on 5/26/2015.
 */
class kPerson(){
    private var age = 0
    private var first = "default"
    private var last = "default"
    private var weight = 0.0
    private var siblings = ArrayList<String>();

    init{
        
    }

    constructor(age:Int, first:String, last:String, weight:Double, siblings:ArrayList<String>) : this(){
        this.age = age;
        this.first = first;
        this.last = last;
        this.weight = weight;
        this.siblings = ArrayList<String>(siblings);
    }

    fun getAge(): Int{
        return this.age;
    }

    fun getFirst(): String{
        return this.first;
    }

    fun getLast(): String{
        return this.last;
    }

    fun getWeight(): Double{
        return this.weight;
    }

    fun getSiblings(): ArrayList<String>{
        return this.siblings;
    }

    fun setAge(age:Int){
        this.age = age;
    }

    fun setFirst(first:String){
        this.first = first;
    }

    fun setLast(last:String){
        this.last = last;
    }

    fun setWeight(weight:Double){
        this.weight = weight;
    }

    fun setSiblings(siblings:ArrayList<String>){
        this.siblings = siblings;
    }

}

