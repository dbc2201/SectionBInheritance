/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 1:14 PM
 *  File Name : FourWheeler.java
 * */
package definitions.transport;

public class FourWheeler extends Vehicle {
    public void travel(String source, String destination) {
        System.out.println("FourWheeler is travelling from " +
                source + " to " + destination + ".");
    }

    // This is an overridden version of the travel() method in the Vehicle class.
    // This travel() method is overridden.
    // @Override // annotation : are used to modify the behavior of a piece code.
    // It checks if the method created here has the same method signature as
    // the method in the parent class.
    @Override
    public void travel() {
        System.out.println("FourWheeler is travelling to Delhi.");
    }
}

// The Vehicle.java class is the parent class of the FourWheeler.java class.
// The FourWheeler.java class is the child class of the Vehicle.java class.
