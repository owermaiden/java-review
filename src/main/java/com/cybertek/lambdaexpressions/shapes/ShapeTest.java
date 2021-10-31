package com.cybertek.lambdaexpressions.shapes;

public class ShapeTest{
    public static void main(String[] args) {

        Drawable drawable = () -> System.out.println("Drawing a circle");
        drawable.draw();

        Drawable2 drawable2 = shape -> System.out.println("Draing a "+ shape);
        drawable2.draw("Triangle");

        Drawable3 drawable3 = (shape, name) -> System.out.println(name+ " Drawing a "+shape);
        drawable3.draw("circle", "omer");

        Drawable4 drawable4 = (shape, area) -> "Bir "+ shape+ " in alanı = "+ area;
        String alan = drawable4.draw("circle", 200);
        System.out.println(alan);
    }

}
