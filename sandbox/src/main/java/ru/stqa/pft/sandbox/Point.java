package ru.stqa.pft.sandbox;

public class Point {
  public static void main(String[] args){
    Point p1=new Point(3,4);
    Point p2=new Point(6,8);
    System.out.println("расстояние между двумя точками с координаами ("+p1.x+";"+p1.y+") и ("+p2.x+";"+p2.y+") = "+Point.distance(p1,p2));
  }
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static double distance(Point p1, Point p2) {
    double dx = p2.x - p1.x;
    double dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

}

/*
public class Point {
  Point p = new Point(5, 9, 5, 7);
  System.out.println("Расстояние между двумя точками с координатами (" + p.x1 + ";" + p.y1 + ") и (" + p.x2 + ";" + p.y2 + ") = " + p.area());

  public double x1;
  public double y1;
  public double x2;
  public double y2;

  public Point(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public double area() {
    return Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));
  }

}
*/



