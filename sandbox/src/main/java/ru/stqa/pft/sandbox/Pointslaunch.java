package ru.stqa.pft.sandbox;

public class Pointslaunch {
  public static void main(String[] args){
    Point p = new Point(2,6, 5, 10);
    System.out.println("расстояние между двумя точками с координаами (" +p.x1 + ";" +p .y1 + ") и (" + p.x2 + ";" + p.y2 + ") = " + p.distance());
  }
}
