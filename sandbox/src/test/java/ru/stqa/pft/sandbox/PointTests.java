package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by zacharewicz on 2017-04-02.
 */
public class PointTests {

  @Test
  public void testDistance(){
    Point p = new Point();
    Point p1 = new Point(0.0,0.0);
    Point p2 = new Point(0.0,8.0);

    assert p.distance(p1,p2) == 8.0;

  }
}
