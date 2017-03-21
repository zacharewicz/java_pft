package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
      System.out.println(".");
      System.out.println(".");

     double a = 4;
     double b = 6;
     System.out.println("Powierzchnia prostokąta o bokach " + a + " i " + b + " = " + area(a,b));
    }

  public static double area(double a, double b) {
        return a * b;
    }
}



