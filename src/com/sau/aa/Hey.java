package com.sau.aa;

public class Hey {
    public  int a = 10;
    public  static  int b = 20;

    public  void showHi(){
        System.out.println("Hi...");
    }
    public  static  void showHey(){
        System.out.println("Hey...");
    }
    public  void metaA(){
        a = 11;
        b = 22;
        showHi();
        showHey();
    }
    public  static void meyB(){
        //a = 11;
        b = 22;
        //showHi();
        showHey();
    }
}
