package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

import java.util.ArrayList;
import java.util.Collection;

class ShapeClient
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(1.0);
        System.out.println("The area of the circle is: " + c1.getArea());
        System.out.println();

        Rectangle r1 = new Rectangle(8.0, 10.0);
        System.out.println("The area of the rectangle is: " + r1.getArea());
        System.out.println();

        Triangle t1 = new Triangle(2.0, 3.0, 30.0);
        System.out.println("The area of the triangle is: " + t1.getArea());
        System.out.println();

        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(r1);
        shapes.add(t1);

        double totalArea = 0.0;

        for(Shape shape : shapes)
        {
            double area = shape.getArea();
            System.out.println("The area is: " + area);
            totalArea += area; // totalArea = totalArea + area
        }

        System.out.println("The total area of all shapes is: " + totalArea);

    }

}
