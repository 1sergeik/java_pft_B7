package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests3 {
  @Test
  public void testPoint3(){
    Point p1= new Point(1.5,-2);
    Point p2= new Point(-3,4);
    Assert.assertEquals(p1.distance(p1,p2),7.5);
  }

}
