/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.abstractFactory;

/**
 *
 * @author linux
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            return new CardFactory();
        }else if ("PaymentMethod".equals(chooseFactory)){
            return new PaymentMethodFactory();
        }
        return null;
    }
}
