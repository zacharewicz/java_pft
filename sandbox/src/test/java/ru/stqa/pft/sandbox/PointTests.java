package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.Point.distance;


/**
 * Created by zacharewicz on 2017-04-02.
 */
public class PointTests {

  @Test
  public void testDistance(){
   Point p1 = new Point(2.0,4.0);
   Point p2 = new Point(5.0,8.0);
   Assert.assertEquals(distance(p1,p2),5.0);
  }
}

