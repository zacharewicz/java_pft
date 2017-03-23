package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {
    System.out.println("Hello, Alexei!");

    Point p1 = new Point();
    Point p2 = new Point();

    p1.x = 5.5;
    p2.x = 3.3;
    p1.y = 1.1;
    p2.y = 8.8;

    System.out.println("Point 1 has coodrinate (" + p1.x + ", " + p1.y + ")");
    System.out.println("Point 2 has coodrinate (" + p2.x + ", " + p2.y + ")");
    System.out.println("Distance between points is " + distance(p1,p2));
  }

  public static double distance(Point p1, Point p2){
    return  Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
  }
}


