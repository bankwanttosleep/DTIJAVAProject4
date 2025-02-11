package com.sau.wow;

public class test01 {
    public static void main(String[] args) {

        DtiSAU mod;
        mod = new DtiSAU();



        mod.name = "armchair";
        System.out.println(mod.name + "สูง " + mod.high);

        DtiSAU med = null;
        med.name = "isomeric";
        med.showHi();

    }
}