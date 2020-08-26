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
}

// The Vehicle.java class is the parent class of the FourWheeler.java class.
// The FourWheeler.java class is the child class of the Vehicle.java class.
