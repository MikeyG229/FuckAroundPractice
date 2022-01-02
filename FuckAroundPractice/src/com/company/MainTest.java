
package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void listCheck(){
      TestList testList = new TestList();
        List<String> actualList =testList.createListFromStringInput("Test");
        List<String> expectedList = new ArrayList<>(Arrays.asList("Test"));
        assertEquals(actualList,expectedList);
        }
    @Test
    public void worldTest(){
        World world = new World();
        String actualHelloString = world.helloWorld();
        String expected = "Hello World";
        assertEquals(expected,actualHelloString);


    }
    @Test
    public void listCheckMultiple(){
        TestList testList = new TestList();
        List<String> actualList = testList.createListFromStringInput("Test");

        actualList.add("Test2");
        List<String> expectedList = new ArrayList<>(Arrays.asList("Test","Test2"));

        assertEquals(actualList,expectedList);
    }

    @Test
    public void switchDemoReturnMonthIntInput(){
        ReturnMonth switchDemo = new ReturnMonth();
       String actualMonth =  switchDemo.returnMonthIntInput(1);
       String expectedMonth = "January";
       assertEquals(expectedMonth,actualMonth);
    }
    @Test
    public void switchDemoReturnMonthStringInputJan(){
        ReturnMonth returnMonth = new ReturnMonth();
        int actualMonth =  returnMonth.returnMonthStrInput("January");
        int expectedMonth = 1;
        assertEquals(expectedMonth,actualMonth);
    }
    @Test
    public void switchDemoReturnMonthStringInputDec(){
        ReturnMonth returnMonth = new ReturnMonth();
        int actualMonth =  returnMonth.returnMonthStrInput("December");
        int expectedMonth = 12;
        assertEquals(expectedMonth,actualMonth);
    }

    @Test
    public void SelectedMonthString(){
        int expectedMonth = 1;
       int actualMonth = SelectedMonthType.stringMethod("January");
        assertEquals(expectedMonth,actualMonth );
    }
    @Test
    public void SelectedMonthInt(){
        String expectedMonth = "January";
        String actualMonth = SelectedMonthType.callIntMethod(1);
        assertEquals(expectedMonth,actualMonth );
    }

    @Test

    public void abstractCircleTest(){
        Shape shapeCircle = new Circle();
        shapeCircle.draw();
        String actual = shapeCircle.speak();
        String expected = "I'm a circle bitch!";
        assertEquals(expected,actual );
    }

    @Test
    public void abstractSquareTest(){
        Shape shapeSquare = new Square();
        shapeSquare.draw();
        String actual = shapeSquare.speak();
        String expected = "I'm a square bitch!";
        assertEquals(expected,actual );
    }


}


