package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
      System.out.println(".");
      System.out.println(".");
      System.out.println(".");

     double l= 5;
     System.out.println("Powierzchnia kwadratu o boku " + l + " = " + area(l));


    }



  public static double area(double len) {
        return len * len;
    }
}



