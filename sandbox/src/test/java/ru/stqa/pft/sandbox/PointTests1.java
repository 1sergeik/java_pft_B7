package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTests1 {
  @Test
  public void testPoint1(){
    Point p1= new Point(-1,-1);
    Point p2= new Point(2,3);
    Assert.assertEquals(p1.distance(p1,p2),5.0);
  }

}
