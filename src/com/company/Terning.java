package com.company;

import java.util.Random;

public class Terning {


    private int slag;

    Random r = new Random();

    public Terning (){

        kast();
    }

    public Terning (int antalSider){

        System.out.println("ny terning med "+antalSider + " sider");
    }

    void kast (){

        slag = r.nextInt(6)+1;
    }

    int getVærdi() {

        return slag;
    }

    public void setSlag(int nytSlag){
        if (nytSlag < 1 || nytSlag > 6) System.out.println("FEJL");
        else slag = nytSlag;
    }

}
