package com.testBase;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {
    public static void main(String[] args) {

        String names[]={"java","python","rubi","java","selenium"};

        Set<String> store=new HashSet<String>();

        for (String name: names){
            if(store.add(name)==false){
                System.out.println(name);
            }
        }
    }
}
