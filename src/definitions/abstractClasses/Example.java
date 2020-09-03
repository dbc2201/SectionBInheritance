/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 1:05 PM
 *  File Name : Example.java
 * */
package definitions.abstractClasses;

public class Example {
    public static void main(String[] args) {

    }
}

abstract class Human { // This class is now an abstract class.
    abstract public void talk(); // abstract: something that is not properly defined
    // abstract methods are those method whose body is not defined

    abstract public void eat();

    public void walk() {
        System.out.println("I am walking like a Human.");
    }
}

class Student extends Human {
    @Override
    public void talk() {
        System.out.println("I am a Student.");
    }

    @Override
    public void eat() {

    }
}

class Teacher extends Human {

    @Override
    public void talk() {

    }

    @Override
    public void eat() {

    }
}
