package kata.supermarket;

import java.math.BigDecimal;

public class Product {

    private final BigDecimal pricePerUnit;

    private String discountName;

    public Product(final BigDecimal pricePerUnit, String discountName) {
        this.pricePerUnit = pricePerUnit;
        this.discountName = discountName;
    }

    public Product(final BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    BigDecimal pricePerUnit() {
        return pricePerUnit;
    }

    public String getDiscountName() {
        return discountName;
    }

    public Item  oneOf() {
        return new ItemByUnit(this);
    }
}
