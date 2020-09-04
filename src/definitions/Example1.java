/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 12:05 PM
 *  File Name : Example1.java
 * */
package definitions;

interface Interface1 {

}
interface Interface3 {

}
interface Interface4 {

}
interface Interface2 extends Interface1, Interface3, Interface4 {

}
class Class1 extends Class2 implements Interface1, Interface2 {

}
class Class2 {

}
class Execution {
    public static void main(String[] args) {

    }
}