package ru.stqa.pft.sandbox;

public class distance_2_points {
  public static void main(String[] args) {
    Point p1= new Point(-1,-1);
    Point p2= new Point(2,3);
    System.out.println("Дистанция между точками p1 ("+p1.x+";"+p1.y+") и p2 ("+p2.x+";"+p2.y+") равна "+p1.distance(p1,p2));
  }

}
