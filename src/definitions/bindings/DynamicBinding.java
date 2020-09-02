/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 31/08/20
 *  Time: 1:19 PM
 *  File Name : DynamicBinding.java
 * */
package definitions.bindings;

public class DynamicBinding {
    public static void main(String[] args) {
        Jet airplane = new Jet();
        // We are creating an object of the child class, and
        // we are storing the reference value of the object
        // in a reference variable of its parent class.
        airplane.display();
        // The reference variable is from the parent class,
        // so it can only call the method that are
        // 1. Either created in the Airplane class itself,
        // 2. Or overridden in the child class, whose object reference is stored inside
        // the reference variable.
    }
}

class Airplane {
    public void display() {
        System.out.println("Airplane class.");
    }
}

class Jet extends Airplane {
    public void displayFuelStatus() {
        System.out.println("Sufficient fuel remaining.");
    }
    // This displayFuelStatus() methods, does not follow either of the conditions.
    // It is not created in the Airplane class,
    // neither it is overridden in the child class, ok?

    @Override
    public void display() {
        System.out.println("Jet class.");
    }
}
