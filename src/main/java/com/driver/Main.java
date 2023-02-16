package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        // we have to use the getters and setters in this case because variable declared as private
        obj.setName("Somuip");
        System.out.println(obj.getName());
    }
  
}