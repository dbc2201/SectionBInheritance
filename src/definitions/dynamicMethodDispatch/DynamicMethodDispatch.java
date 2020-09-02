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
        DeliveryBike deliveryBike = new DeliveryBike();
        deliveryBike.display();
        Bike newBike = deliveryBike;
        // so, we have shared the reference value of `bike` to `newBike`.
        // both the variables refer to the same object.
        newBike.display();
        // which method would be called? #1, #2 or #3??
        // even if the reference variable is created with the Parent class type,
        // the actual reference value is of the child class type,
        // and since, we have overridden the display()  method in the child class as well
        // we can still call it.
        // This is known as Dynamic Method Dispatch.
        // Calling the overridden version of a method from the child class,
        // with the reference variable of the parent class.
        // It only works if the child class has overridden the method from the
        // parent class.
        // If the child class does not have an overridden method, the method
        // from the parent class will be called.
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
    // if we comment out the above code,
    // then the DeliveryBike class does not have any overridden version of
    // the display() method, in this case, the display method from the
    // Bike class will be called.
}
