package kata.supermarket;

import java.math.BigDecimal;

public class WeighedProduct {

    private final BigDecimal pricePerKilo;

    private String discountName;

    public WeighedProduct(BigDecimal pricePerKilo, String discountName) {
        this.pricePerKilo = pricePerKilo;
        this.discountName = discountName;
    }

    public WeighedProduct(final BigDecimal pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    BigDecimal pricePerKilo() {
        return pricePerKilo;
    }

    public String getDiscountName() {
        return discountName;
    }

    public Item weighing(final BigDecimal kilos) {
        return new ItemByWeight(this, kilos);
    }



}
