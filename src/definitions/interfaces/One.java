/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 1:21 PM
 *  File Name : One.java
 * */
package definitions.interfaces;

import bank.Bank;

public interface One {
    // 1. For fields
    // i. all the fields must be initialized while declaring.
    // ii. all the fields of an interface
    // are automatically considered to be public by the compiler.
    // iii. all the fields of an interface are automatically considered
    // to be 'final' variable i.e we cannot change the values of these fields.
    // iv. all the fields of an interface are automatically considered
    // to be static also.
    // public static final <dataType> <variableName> = <initialValue>;
    int number = 5;

    // 2. For methods
    // i. all the methods in an interface are automatically considered
    // to be abstract i.e we cannot define their bodies.
    // ii. all the methods in an interface are automatically considered
    // to be declared as public.
    // iii. all the methods in an interface are automatically considered
    // to be declared as abstract.
    public abstract void method1();
    // after Java 9, we have included three new types of method in an interface:
    // 1. A default method
    // 2. A private method
    // 3. A static method


    // THIS IS NOT THE DEFAULT VISIBILITY MODIFIER!
    default void method3() {
        privateMethod();
    }

    private void privateMethod() {

    }

    static void staticMethod() {

    }

}

abstract class AbstractClassExample {
    public abstract void method1();
    public void method2() {

    }
}

class Execution implements One {
    @Override
    public void method1() {

    }

    @Override
    public void method3() {

    }

//    @Override
//    public static void staticMetho() {
//
//    }

//    @Override
//    private void privateMethod() {
//
//    }
}
