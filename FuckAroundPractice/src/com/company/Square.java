package com.company;

public class Square extends Shape{
    @Override
    void draw() {
            System.out.println("I'm a square bitch!");
    }

    @Override
    String speak() {

        return "I'm a square bitch!";
    }

}
