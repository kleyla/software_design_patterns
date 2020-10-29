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
public class Platinium implements ApproveLoanChain{
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
        if(totalLoan > 10000 && totalLoan <= 50000 ){
            System.out.println("Esta solicitud de tarjeta de credito la maneja la tarjeta Paltinium");
        }else{
            // Funcion de la cadena de responsabilidad
            next.crediCardRequest(totalLoan);
        }
    }
}
