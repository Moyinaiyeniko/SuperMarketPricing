package kata.supermarket;

import java.math.BigDecimal;

public class ItemByUnit implements Item {


    private final Product product;


    ItemByUnit(final Product product) {
        this.product = product;

    }

    public Product getProduct() {
        return product;
    }

    public String discountId(){
        return product.getDiscountName();
    }
    public BigDecimal price() {
        return product.pricePerUnit();
    }
}
