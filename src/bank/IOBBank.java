/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 04/09/20
 *  Time: 12:30 PM
 *  File Name : IOBBank.java
 * */
package bank;

public class IOBBank implements Bank, ATM {

    @Override
    public void withdrawMoney() {
        dispenseMoney(1000.0);
    }

    private void dispenseMoney(double amount) {

    }

    @Override
    public void createBankAccount() {
        fillAccountOpeningForm();
    }

    private void fillAccountOpeningForm() {

    }
}
