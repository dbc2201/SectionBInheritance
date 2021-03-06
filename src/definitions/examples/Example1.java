/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 1:28 PM
 *  File Name : Example1.java
 * */
package definitions.examples;

public class Example1 {
    public static void main(String[] args) {
        DemoA objectA = new DemoA();
        objectA.display();
        DemoB objectB = new DemoB();
        objectB.display();
    }
}
class DemoA { // visibility modifier: default
    public void display() { // method 1
        System.out.println("Parent Class Method.");
    }
}
class DemoB extends DemoA {
    @Override
    public void display() { // method 2, method overriding
        System.out.println("Child Class Method.");
    }
}

