package com.company;

public class Circle extends Shape {
    @Override
   void draw() {
        System.out.println("I'm a circle bitch!");
    }

    @Override
    public String speak(){
        return  "I'm a circle bitch!";
    }
}
