package ru.stqa.pft.sandbox;

public class distance_2_points {
  public static void main(String[] args) {
    Point p1= new Point(1,1);
    Point p2= new Point(4,5);
    System.out.println("Дистанция между точками p1 ("+p1.x+";"+p1.y+") и p2 ("+p2.x+";"+p2.y+") равна "+distance(p1,p2));
  }
  public static double distance(Point p1, Point p2){
    return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));

  }
}
