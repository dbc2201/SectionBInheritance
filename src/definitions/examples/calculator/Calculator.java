/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 1:53 PM
 *  File Name : Calculator.java
 * */
package definitions.examples.calculator;

public class Calculator {
    public static void main(String[] args) {

    }
}
class A {
    public int i, j;

    void setValues(int x, int y) {
        i = x;
        j = y;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("i = " + i + ", j = " + j);
    }

    public int sum(int x, int y) {
        int sum = i + j;
        return sum;
    }
}
class B extends A {
    public int product(int x, int y) {
        int product = i * j;
        return product;
    }
}
class C extends A {
    public int division(int x, int y) {
        int division = i / j;
        return division;
    }

    public int difference(int x, int y) {
        int difference = i - j;
        return difference;
    }
}









