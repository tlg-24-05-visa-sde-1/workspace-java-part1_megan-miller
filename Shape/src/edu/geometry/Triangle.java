package edu.geometry;

public class Triangle implements Shape
{
    private final double side1;
    private final double base;
    private final double sideAngle;

    public Triangle(double side1, double base, double sideAngle)
    {
        this.side1 = side1;
        this.base = base;
        this.sideAngle = sideAngle;
    }

    @Override
    public double getArea()
    {
        return 0.5 * side1 * base * Math.sin(Math.toRadians(sideAngle));
    }

    public double getSide1()
    {
        return side1;
    }

    public double getBase()
    {
        return base;
    }

    public double getSideAngle()
    {
        return sideAngle;
    }
}
