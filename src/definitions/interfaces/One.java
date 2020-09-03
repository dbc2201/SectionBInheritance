/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 03/09/20
 *  Time: 1:21 PM
 *  File Name : One.java
 * */
package definitions.interfaces;

public interface One {
    // 1. For fields
    // i. all the fields must be initialized while declaring.
    // ii. all the fields of an interface
    // are automatically considered to be public by the compiler.
    // iii. all the fields of an interface are automatically considered
    // to be 'final' variable i.e we cannot change the values of these fields.
    // public final <dataType> <variableName> = <initialValue>;
    int number = 5;

    // 2. For methods
    // i. all the methods in an interface are automatically considered
    // to be abstract i.e we cannot define their bodies.
    // ii. all the methods in an interface are automatically considered
    // to be declared as public.
    // iii. all the methods in an interface are automatically considered
    // to be declared as abstract.
    void method1();
}
