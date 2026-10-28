
package oop_project;

public class Circle extends Shape{
    private  double radius;

    public Circle(double radius) {
      this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
         return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
   public String howToDraw() {
   return "Circle";
    }

    @Override
    public String toString() {
        return "Circle{" +"color ="+ super.getColor()+ "dateCreated ="+super.getDateCreated()+"radius=" + this.radius + '}';
    }
    
}
