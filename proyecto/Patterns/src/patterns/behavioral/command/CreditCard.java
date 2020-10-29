/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.command;

/**
 *
 * @author linux
 */
public class CreditCard {
    
    public void sendPinNumberToCustomer(){
        System.out.println("El PIN number ha sido enviado al cliente");
    }
    public void sendSMSToCustomerActivate(){
        System.out.println("Enviado SMS al cliente informando que su tarjeta ha sido activada. Ponte en contacto si no la has recibido");
    }
    public void activate(){
        System.out.println("La tarjeta ha sido activada");
    }
    public void desactivate(){
        System.out.println("La terjeta ha sido desactivada");
    }
    public void sendSMSToCustomerDesactivate(){
        System.out.println("Enviado SMS al cliente informando de que su tarjeta ha sido desactivada");
    }
}
