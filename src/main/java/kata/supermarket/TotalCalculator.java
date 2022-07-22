package kata.supermarket;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class TotalCalculator {

    public static BigDecimal subtotal(Basket basket) {
        return basket.items().stream().map(Item::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    /**
     * TODO: This could be a good place to apply the results of
     *  the discount calculations.
     *  It is not likely to be the best place to do those calculations.
     *  Think about how Basket could interact with something
     *  which provides that functionality.
     */



    public static BigDecimal discounts(Basket basket) {
        List<Item > items = basket.items();
        BigDecimal result = items.stream().map(Item::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("product total" + result);
        System.out.println("disc"+ basket.getDiscount().stream().map(discount -> discount.getValue(discount.getName(),result)).reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP));
        return basket.getDiscount().stream().map(discount -> discount.getValue(discount.getName(),result)).reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculateTotal(Basket basket) {
     System.out.println("final total"+subtotal(basket).subtract(discounts(basket)));
        return subtotal(basket).subtract(discounts(basket));
    }

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new ItemByUnit(new Product(new BigDecimal("4.0"),"BOGO")));
        basket.add(new ItemByUnit(new Product(new BigDecimal("4.0"), "BOGO")));
        basket.add(new ItemByWeight(new WeighedProduct(new BigDecimal("4.0"), "BOFH"),new BigDecimal(2)));
        calculateTotal(basket);

    }
}
