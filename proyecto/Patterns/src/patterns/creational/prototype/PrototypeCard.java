/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.prototype;

/**
 *
 * @author linux
 */
public interface PrototypeCard extends Cloneable{
    
    void getCard();
    
    PrototypeCard clone() throws CloneNotSupportedException;
}
