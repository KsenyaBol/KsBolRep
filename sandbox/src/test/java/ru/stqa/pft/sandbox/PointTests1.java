package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests1 {

  @Test
  public void testDistance() {
    Point p1 = new Point(2, 6);
    Point p2 = new Point(5, 10);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }
}

