/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.behavioral.chainOfResponsability;

/**
 *
 * @author linux
 */
public class Tarjeta implements ApproveLoanChain{
//    Es la que se encarga de organizar la cadena de responasabilidad 

    private ApproveLoanChain next;
    
    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void crediCardRequest(int totalLoan) {
        Gold gold = new Gold();
        this.setNext(gold);
        
        Platinium platinium = new Platinium();
        gold.setNext(platinium);
        
        Black black = new Black();
        platinium.setNext(black);
        
        next.crediCardRequest(totalLoan);
    }
    
}
