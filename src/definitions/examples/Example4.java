/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 12:19 PM
 *  File Name : Example4.java
 * */
package definitions.examples;

public class Example4 {
    public static void main(String[] args) {
        A1 objectA1 = new A1();
        B1 objectB1 = new B1();
        objectA1.j = 4;
        objectA1.k = 5;
        objectA1.displayA();
        objectB1.j = 10;
        objectB1.k = 20;
        objectB1.m = 30;
        objectB1.displayB();
    }
}
class A1 {
    int j, k;
    void displayA() {
        System.out.println("j = " + j + " k = " + k);
        System.out.println("j * k = " + (j * k));
    }
}
class B1 extends A1 {
    int m;
    void displayB() {
        System.out.println("m = " + m + ", j = " + j + ", " + " k = " + k);
        System.out.println("(m * j * k) = " + (m * j * k));
    }
}