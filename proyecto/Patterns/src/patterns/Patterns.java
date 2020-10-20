/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import patterns.creational.abstractFactory.AbstractFactory;
import patterns.creational.abstractFactory.Card;
import patterns.creational.abstractFactory.FactoryProvider;
import patterns.creational.abstractFactory.PaymentMethod;
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
        // probarFactory();
        probarAbstractMethod();
    }
    
    private static void probarAbstractMethod(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");
        
        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");
        System.out.println("Una tarjeta de tipo "+ tarjeta.getCardType()+ " con el metodo de pago " + paymentMethod.doPayment());
    }
    private static void probarFactory(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
    
}
