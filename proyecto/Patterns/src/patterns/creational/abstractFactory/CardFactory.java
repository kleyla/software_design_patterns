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
public class CardFactory implements AbstractFactory<Card>{
    @Override
    public Card create(String type){
        if("VISA".equals(type)){
            return new Visa();
        }else if ("MASTERCARD".equals(type)){
            return new MasterCard();
        }
        return null;
    }
}
