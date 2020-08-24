/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 24/08/20
 *  Time: 1:54 PM
 *  File Name : Main.java
 * */
package execution;

import definitions.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        MobilePhone mobilePhone = new MobilePhone();
    }
}