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
public class CreditCardInvoker {
    
    private Command command;
    public CreditCardInvoker(){
        
    }
    public void setCommand(Command command){
        this.command = command;
    }
    public void run(){
        command.execute();
    }
}
