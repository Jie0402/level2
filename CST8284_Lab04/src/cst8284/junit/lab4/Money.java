package cst8284.junit.lab4;

import java.math.BigDecimal;


public class Money {

    private BigDecimal price;
    private Currency currency;

    /**
     * Constructs a new Money object with the specified price and currency.
     *
     * @param price - the price to store.
     * @param currency - the currency to link to the price.
     */
    public Money(BigDecimal price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    /**
     * Returns the price of a Money object.
     *
     * @return the price.
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Returns the currency of a Money object
     *
     * @return the currency.
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * 
     */
    @Override
    public int hashCode() {
        return price.hashCode() + currency.hashCode();
    }


    /**
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money && obj != null) {
            Money cmpObj = (Money) obj;
            return (price.compareTo(cmpObj.getPrice()) == 0 ? true : false) && currency.equals(cmpObj.getCurrency());
        }

        return false;
    }
}
