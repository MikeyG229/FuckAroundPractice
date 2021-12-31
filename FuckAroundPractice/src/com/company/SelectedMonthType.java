package com.company;

public interface SelectedMonthType {

     static int stringMethod(String input){
         ReturnMonth returnMonth = new ReturnMonth();
         int returnValue = returnMonth.returnMonthStrInput(input);
         return returnValue;
    }


    static String callIntMethod(int input) {
        ReturnMonth returnMonth = new ReturnMonth();
        String returnValue = returnMonth.returnMonthIntInput(input);
        return returnValue;
    }
}
