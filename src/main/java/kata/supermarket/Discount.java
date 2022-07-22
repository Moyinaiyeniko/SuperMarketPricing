package kata.supermarket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Discount {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public Discount(String name) {
        this.name = name;

    }



    public BigDecimal getValue(String name, BigDecimal productPrice){
        DiscountType discountType = DiscountType.valueOf(name);
        BigDecimal value = new BigDecimal(0);
        switch (discountType) {
            case BOGO:
               value = new BigDecimal(0.50).multiply(productPrice);
                break;
            case BTFFP:
                value = new BigDecimal(0.10).multiply(productPrice);
                break;
            case BTFT:
                value = new BigDecimal(0.667).multiply(productPrice);
                break;
            case BOFH:
                value = new BigDecimal(0.50).multiply(productPrice);
                break;
        }
        return value;
    }


}
