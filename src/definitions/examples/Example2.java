/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 27/08/20
 *  Time: 1:36 PM
 *  File Name : Example2.java
 * */
package definitions.examples;

public class Example2 {
    public static void main(String[] args) {
        D objectD = new D();
        objectD.methodA(4); // A <- B <- D
        objectD.methodD(5);
    }
}
class A {
    int j = 0;

    public void methodA(int k) {
        j = k;
        System.out.println("Class A : j = " + j);
    }
}
class B extends A {
    @Override
    public void methodA(int k) {
        j = k * k;
        System.out.println("Class B : j = " + j);
    }
    public void methodB() {
        System.out.println("Class B");
    }
}
// Hie-rar-chi-cal (4 syllables) Inheritance
class C extends A {
    public void methodA(int x) { // method overriding? YES!
        j = x * 5;
        System.out.println("j = " + j);
    }
    public void methodC() {
        System.out.println("Class C");
    }
}
class D extends B {
    public void methodD(int k) {
        System.out.println("Class D");
    }
}