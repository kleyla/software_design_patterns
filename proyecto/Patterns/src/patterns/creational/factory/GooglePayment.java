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
public class GooglePayment implements Payment {
    
    @Override
    public void doPayment(){
        System.out.println("Pagando con Google Payment");
    }
}
