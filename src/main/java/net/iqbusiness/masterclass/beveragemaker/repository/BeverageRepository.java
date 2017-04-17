package net.iqbusiness.masterclass.beveragemaker.repository;

import net.iqbusiness.masterclass.beveragemaker.model.Beverage;

import java.math.BigDecimal;

/**
 * Created by abawa on 2017/04/17.
 */
public class BeverageRepository {

    public static Beverage getTea() {
        return new Beverage("Tea", "Naboo Green Tea", new BigDecimal("18.50"));
    }

    public static Beverage getCoffee() {
        return new Beverage("Coffee", "Tatooine Dark Roast", new BigDecimal("23.50"));
    }
}
