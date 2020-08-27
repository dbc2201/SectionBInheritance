/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 26/08/20
 *  Time: 1:13 PM
 *  File Name : Vehicle.java
 * */
package definitions.transport;

public class Vehicle {

    protected static class Engine { // accessible inside every child class
        // even if the child class is outside this package.
        private static Engine vehicleEngine;

        public static Engine getVehicleEngine() {
            return vehicleEngine;
        }

        public void setVehicleEngine(Engine vehicleEngine) {
            vehicleEngine = vehicleEngine;
        }
    }

    public Engine returnEngine() {
        return Engine.getVehicleEngine();
    }

    /**
     * This method will allow the Vehicle to travel to a pre-defined location.
     */
    public void travel() {
        System.out.println("Vehicle is travelling to Delhi.");
    }

    // we can either change the number of parameters.
    // or we can change the type of the parameters.
    // This is an overloaded version of the travel() method.
    // This is an overloaded travel() method with a String parameter.
    public void travel(String destination) {
        System.out.println("Vehicle is travelling to " + destination + ".");
    }
}
