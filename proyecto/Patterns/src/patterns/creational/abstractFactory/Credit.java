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
public class Credit implements PaymentMethod{

    @Override
    public String doPayment() {
       return "PAgo a Credito";
    }
    
}
