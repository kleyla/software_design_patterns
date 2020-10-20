/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import patterns.creational.factory.Payment;
import patterns.creational.factory.PaymentFactory;
import patterns.creational.factory.TypePayment;

/**
 *
 * @author linux
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        probarFactory();
    }
    
    private static void probarFactory(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
    
}
