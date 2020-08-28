/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 12:12 PM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {

    }
}
class Vehicle {
    float speed;
    float mileage;
    public void methodA() {
        System.out.println("Class Vehicle Method.");
    }
}
class Bus extends Vehicle {
    public void methodA() {
        System.out.println("Class Bus Method.");
    }
}
