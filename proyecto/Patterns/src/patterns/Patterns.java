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
import patterns.creational.prototype.PrototypeCard;
import patterns.creational.prototype.PrototypeFactory;

import static patterns.creational.prototype.PrototypeFactory.CardType.VISA;
import static patterns.creational.prototype.PrototypeFactory.CardType.AMEX;
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
        //   probarAbstractMethod();
        //        probarBuilder();
        // probarPrototype();
        probarSingleton();
    }
    
    private static void probarSingleton(){
        // No se puede instanciar de esta manera yq que es privado
        // patterns.creational.singleton.Card card = new patterns.creational.singleton.Card();
        patterns.creational.singleton.Card.getINSTANCE().setCardNumber("123");
        System.out.println(patterns.creational.singleton.Card.getINSTANCE().getCardNumber());
    }
    private static void probarPrototype(){
        PrototypeFactory.loadCard();
        try{
            PrototypeCard visa = PrototypeFactory.getInstance(VISA);
            visa.getCard();
            
            PrototypeCard amex = PrototypeFactory.getInstance(AMEX);
            amex.getCard();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
    private static void probarBuilder(){
        patterns.creational.builder.Card card = new patterns.creational.builder.Card.CardBuilder("VISA", "0000 1111 2222 3333")
                .name("KAren").expires(2030).credit(true).build();
        System.out.println(card);
        
        patterns.creational.builder.Card card2 = new patterns.creational.builder.Card.CardBuilder("VISA", "123456").build();
        System.out.println(card2);
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
