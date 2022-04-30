package ru.stqa.pft.sandbox;

public class Pointslaunch {
  public static void main(String[] args){
    Point p1 = new Point(2, 6);
    Point p2 = new Point(5, 10);
    System.out.println("расстояние между двумя точками с координаами (" +p1.x + ";" +p1.y + ") и (" + p2.x + ";" + p2.y + ") = " + p1.distance(p2));
  }
}
