/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.factory;

/**
 *
 * @author linux
 */
public class PaymentFactory {
        
    public static Payment buildPayment(TypePayment typePAyment) {
        switch (typePAyment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
