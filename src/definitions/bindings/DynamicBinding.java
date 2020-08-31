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

    @Override
    public void display() {
        System.out.println("Jet class.");
    }
}
