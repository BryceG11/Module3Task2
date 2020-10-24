package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ALN = new ArrayList<Integer>();

        ALN.add(10);
        ALN.add(11);
        ALN.add(25);
        ALN.add(32);
        ALN.add(6);

        for(Integer number : ALN){
            System.out.println(number);
        }

    }
}
