
package oop_project;


public abstract class ThreeDShape extends Shape {

    public ThreeDShape() {
    }

    public ThreeDShape(String color) {
        super(color);
    }
    
    public abstract double getVolume();
}
