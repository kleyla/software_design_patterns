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
public interface ApproveLoanChain {
    
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void crediCardRequest(int totalLoan);
    
}
