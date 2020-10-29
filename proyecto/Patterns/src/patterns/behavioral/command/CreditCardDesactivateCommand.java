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
public class CreditCardDesactivateCommand implements Command{

    CreditCard creditCard;
    // constructor
    public CreditCardDesactivateCommand(CreditCard creditCard){
        this.creditCard = creditCard;
    }
    @Override
    public void execute() {
        creditCard.desactivate();
        creditCard.sendSMSToCustomerDesactivate();
    }
    
}
