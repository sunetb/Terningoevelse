package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        //Random terning  = new Random();
        Terning terning = new Terning();

        int resultater[] = new int[6];
        terning.setSlag(6);

        System.out.println(terning.getVærdi());

        for (int i = 0; i < 6000; i++) {
            terning.kast();
            int slag = terning.getVærdi();
            resultater[slag-1]++;
        }

        System.out.println(Arrays.toString(resultater));
    }




}
