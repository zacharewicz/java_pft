package ru.stqa.pft.sandbox;
import java.lang.Math;

/**
 * Created by zacharewicz on 2017-03-24.
 */

public class Point {
  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public Point() {

  }

  public double distance(Point p1, Point p2){
    return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x)+ (p1.y -p2.y)*(p1.y -p2.y));
  }

}