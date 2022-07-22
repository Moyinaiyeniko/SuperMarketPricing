# SuperMarketPricing

The service is meant to calculate the total price of items in a basket, this includes the discount.

What I tried to do?

1. Create an Enum that contains the different possible discounts as explained below:
- BOGO: Buy One Get One Free

- BTFFP: Buy two for fixed price e.g $1 

- BTFT: Buy three for the price of two 

- BOFH: Buy one for half price

2. Assign discount to an Item

3. Create a discount class that maps each discount option to a percentage

4. Create a Total Calculator class that calculates the total price of items in the basket including the discount, the class sums up the total price, sums up the discounts per item and does a subtraction.
