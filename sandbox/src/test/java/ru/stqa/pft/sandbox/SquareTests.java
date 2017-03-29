package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by zacharewicz on 2017-03-29.
 */


public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    assert s.area() == 25;
  }
}
