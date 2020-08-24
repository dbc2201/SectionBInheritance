/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 1:48 PM
 *  File Name : MobilePhone.java
 * */
package definitions;

// that you can carry with you
public class MobilePhone extends Phone {
    public void printContactNumber() {
        System.out.println(getContactNumber());
    }
}

// First, we create a phone in real-world, then, to model it in our program,
// we created a Phone.java class.

// Afterwards, in the real-world, the technology was updated, and there was a new
// type of phone, called mobile phone.
// To model it in our program, we have created MobilePhone.java class.

// Mobile phone "IS A TYPE" of phone.