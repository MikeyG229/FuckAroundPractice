package com.company;

import java.util.ArrayList;
import java.util.List;

public class  TestList {

    private String listInputs;
    private String listInput2;


    public List<String> createListFromStringInput(String listInput) {

        List<String> mutableList = new ArrayList();
        mutableList.add(listInput);
        return mutableList;
    }
}
