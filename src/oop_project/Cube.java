
package oop_project;


public class Cube extends ThreeDShape {
private double side;

 
    public Cube(double side) {
        this.side = side;
    }

    public Cube(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(this.side, 3);
    }

    @Override
    public double getArea() {
        return 6*(Math.pow(this.side, 2));
        
    }

    @Override
    public double getPerimeter() {
         return 12*this.side;
    }

    @Override
    public String howToDraw() {
        return "Cube";
    }

    @Override
    public String toString() {
        return "Cube{" +"color ="+super.getColor()+"dateCreated ="+super.getDateCreated()+ "side =" + this.side + '}';
    }
    
}
