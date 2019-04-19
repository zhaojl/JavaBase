package com.thinking_in_java.chapter1;

public class TestShape {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Line line = new Line();

        doStuff(circle);
        doStuff(triangle);
        doStuff(line);

    }

    private static void doStuff(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
