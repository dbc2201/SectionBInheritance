/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 12:39 PM
 *  File Name : SuperKeywordDemo.java
 * */
package definitions.examples;

public class SuperKeywordDemo {
    public static void main(String[] args) {

    }
}
class Parent {
    private int j;
    public int k;

    public Parent(int j, int k) {
        this.j = j;
        this.k = k;
    }

    public int getJ() {
        return j;
    }

    public void display() {
        System.out.println("j = " + j + ", k = " + k);
    }
}
class Sub extends Parent {
    private int m;

    public Sub(int j, int k, int m) {
        super(j, k); // call the constructor of its parent class
        this.m = m;
    }

    public void displaySub() {
        super.display();
        System.out.println("m = " + m);
    }
}
