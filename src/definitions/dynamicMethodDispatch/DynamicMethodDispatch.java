/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 1:08 PM
 *  File Name : DynamicMethodDispatch.java
 * */
package definitions.dynamicMethodDispatch;

public class DynamicMethodDispatch {
    public static void main(String[] args) {

    }
}

class Bike {
    public void display() {
        System.out.println("Bike Class.");
    }
}

class RacingBike extends Bike {
    @Override
    public void display() {
        System.out.println("RacingBike Class.");
    }
}

class DeliveryBike extends Bike {

}
