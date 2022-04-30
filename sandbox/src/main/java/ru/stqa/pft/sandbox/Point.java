package ru.stqa.pft.sandbox;

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p1) {
    double dx = this.x - p1.x;
    double dy = this.y - p1.y;
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



