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
public class Amex implements PrototypeCard{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void getCard() {
        System.out.println("Esto es una tarjeta Amex");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Clonando tarjeta Amex...");
        return (Amex) super.clone();
    }
    
}
