/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 1:32 PM
 *  File Name : Circle.java
 * */
package definitions.interfaces;

// for inheriting classes and abstract classes we use:
// the `extends` keyword

// for interfaces we use:
// the `implements` keyword

public class Circle implements Radius, PI, AreaCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        int number = 4;
        Integer integer = Integer.valueOf("4");
    }

    @Override
    public void calculateArea() {
        System.out.println(pi * radius * radius);
    }
}
