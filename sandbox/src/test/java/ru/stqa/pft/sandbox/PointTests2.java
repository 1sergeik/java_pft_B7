package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests2 {
  @Test
  public void testPoint2(){
    Point p1= new Point(1.5,-1.5);
    Point p2= new Point(3.5,-3);
    Assert.assertEquals(p1.distance(p2),2.5);
  }

}
