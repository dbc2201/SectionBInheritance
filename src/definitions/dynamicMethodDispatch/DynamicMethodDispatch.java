/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 02/09/20
 *  Time: 1:08 PM
 *  File Name : DynamicMethodDispatch.java
 * */
package definitions.dynamicMethodDispatch;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.display();
        // what would be the output?
        // which method would be called? #1, #2 or #3??
        RacingBike racingBike = new RacingBike();
        racingBike.display();
        // which method would be called? #1, #2 or #3??
    }
}

class Bike {
    public void display() { // 1
        System.out.println("Bike Class.");
    }
}

class RacingBike extends Bike {
    @Override
    public void display() { // 2
        System.out.println("RacingBike Class.");
    }
}

class DeliveryBike extends Bike {
    @Override
    public void display() { // 3
        System.out.println("DeliveryBike Class.");
    }
}
