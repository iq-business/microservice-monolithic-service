package net.iqbusiness.masterclass.beveragemaker.repository;

import net.iqbusiness.masterclass.beveragemaker.model.Beverage;

import java.util.Random;
import java.math.BigDecimal;

/**
 * Created by abawa on 2017/04/17.
 */
public class BeverageRepository {

    private static final int maximumBeveragePrice = 30;
    private static final int minimumBeveragePrice = 10;

    public static Beverage getTea() {
        return new Beverage("Tea", "Naboo Green Tea", BeverageRepository.getRandomPrice());
    }

    public static Beverage getCoffee() {
        return new Beverage("Coffee", "Tatooine Dark Roast", BeverageRepository.getRandomPrice());
    }

    private static BigDecimal getRandomPrice() {
        return new BigDecimal(new Random().nextInt(maximumBeveragePrice - minimumBeveragePrice + 1) + minimumBeveragePrice);
    }
}
