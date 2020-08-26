/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 1:16 PM
 *  File Name : Car.java
 * */
package definitions.transport;

public class Car extends FourWheeler {

}

// Vehicle <- FourWheeler <- Car
// The Vehicle.java class is the parent class of the FourWheeler.java class.
// The FourWheeler.java class is the child class of the Vehicle.java class.
// The FourWheeler.java class is also the parent class of the Car.java class.
// The Car.java class is the child class of the FourWheeler.java class.
// Vehicle <grandparent> <- FourWheeler <parent> <- Car <child> (<- ...)

// A Car IS A type of Vehicle.
// A Car IS A type of FourWheeler as well.

// The Vehicle class is the parent class of the Car class.
// The Car class is the child class of the Vehicle class.
// Vehicle <- Car

// The Vehicle class is also the parent of the FourWheeler class.
// & The FourWheeler class is also a child of the Vehicle class.
// Vehicle <- FourWheeler

// Vehicle <- Car & FourWheeler
// Vehicle <- Car
// Vehicle <- FourWheeler
