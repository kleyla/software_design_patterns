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
public class PaymentMethodFactory implements AbstractFactory<PaymentMethod>{

    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        }else if("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
    
}
