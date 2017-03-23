package ru.stqa.pft.sandbox;

import java.net.PortUnreachableException;

/**
 * Created by zacharewicz on 2017-03-21.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b){
  this.a = a;
  this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}