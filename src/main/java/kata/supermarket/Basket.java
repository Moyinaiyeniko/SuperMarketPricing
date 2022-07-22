package kata.supermarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private  List<Discount> discount;

    private final List<Item> items;

    public Basket() {
        this.discount = new ArrayList<>();

        this.items = new ArrayList<>();
    }

    public void add(final Item item) {
        this.items.add(item);
    }

public void addDiscount(Discount discount){
        this.discount.add(discount);
}

    List<Item> items() {
        return Collections.unmodifiableList(items);
    }

    public List<Discount> getDiscount() {
        return discount;
    }

//    public BigDecimal total() {
//        return new TotalCalculator().calculate();
//    }

    public static void main(String[] args) {

    }

//    private class TotalCalculator {
//        private final List<Item> items;
//
//
//        TotalCalculator() {
//            this.items = items();
//        }
//
//
//
//        private BigDecimal subtotal() {
//            return items.stream().map(Item::price)
//                    .reduce(BigDecimal.ZERO, BigDecimal::add)
//                    .setScale(2, RoundingMode.HALF_UP);
//        }
//
//        /**
//         * TODO: This could be a good place to apply the results of
//         *  the discount calculations.
//         *  It is not likely to be the best place to do those calculations.
//         *  Think about how Basket could interact with something
//         *  which provides that functionality.
//         */
//
//
//        private BigDecimal discounts(List<Discount> discounts) {
//            return discount.calculateDiscount(discounts);
//        }
//
//        private BigDecimal calculate() {
//            return subtotal().subtract(discounts(discounts));
//        }
//
//
//    }
}
