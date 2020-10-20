/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author linux
 */
public class PrototypeFactory {
    
    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";

    }
    
    private static Map<String, PrototypeCard> prototypes = new HashMap<>();
    
    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException{
        return prototypes.get(tipo).clone();
    }
    
    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con numero 0000");
        prototypes.put(CardType.VISA, visa);
        
        Amex amex = new Amex();
        amex.setName("Esta tarjeta es Amex con numero 0000");
        prototypes.put(CardType.AMEX, amex);
    }
    
}
