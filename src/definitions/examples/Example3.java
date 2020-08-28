/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 28/08/20
 *  Time: 12:12 PM
 *  File Name : Example3.java
 * */
package definitions.examples;

public class Example3 {
    public static void main(String[] args) {
//        Bus miniBus = new Bus();
//        miniBus.methodA();
    }
}
final class Vehicle { // this final access modifier is restricting any class from inheriting
    // the Vehicle class.
    float speed;
    float mileage;
    public void methodA() { // 1
        System.out.println("Class Vehicle Method.");
    }
}
/*class Bus extends Vehicle { // cannot inherit the Vehicle class
    // because it is declared as a final class.
    public void methodA() { // 2
        System.out.println("Class Bus Method.");
    }
}*/
